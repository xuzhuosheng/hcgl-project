package com.ihyht.alyxjs.kfzpt.portal.console.caigou;

import com.ihyht.alyxjs.kfzpt.portal.utils.ExcelUtil;
import com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.model.QysswjXxzxTYwCgjh;
import com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.model.QysswjXxzxTYwCgjhxq;
import com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.model.QysswjXxzxTYwLbwh;
import com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.service.QysswjXxzxTYwCgjhService;
import com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.service.QysswjXxzxTYwCgjhxqService;
import com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.service.QysswjXxzxTYwLbwhService;
import com.ihyht.alyxjs.nbjcpt.common.api.ApiReturnCodeEnum;
import com.ihyht.commons.lang.model.RestResponse;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * (QysswjXxzxTYwCgjh)表控制层
 *
 * @author makejava
 * @since 2019-10-21 11:47:26
 */
@Api (value = "采购计划", description = "采购计划")
@PropertySource ("classpath:application.properties")
@RequestMapping ("/Cgjh")
@RestController
public class QysswjXxzxTYwCgjhController {
    /**
     * 服务对象
     */
    @Resource
    private QysswjXxzxTYwCgjhService qysswjXxzxTYwCgjhService;

    @Resource
    private QysswjXxzxTYwLbwhService qysswjXxzxTYwLbwhService;

    @Resource
    private QysswjXxzxTYwCgjhxqService qysswjXxzxTYwCgjhxqService;

    @Value ("${pageSize}")
    private int pageSize;


    @ApiOperation (value = "获取所有采购计划并且分页")
    @ApiImplicitParams (value = {
            @ApiImplicitParam (name = "cgjhmc", value = "采购计划名称", paramType = "query", required = false),
            @ApiImplicitParam (name = "qsrq", value = "起始日期", paramType = "query", required = false),
            @ApiImplicitParam (name = "zzrq", value = "终止日期", paramType = "query", required = false),
            @ApiImplicitParam (name = "pageNum", value = "页码", paramType = "query", required = true)
    })
    @ApiResponse (code = 400, message = "参数没有填好", response = String.class)
    @RequestMapping (value = "/getCgjhList", method = RequestMethod.POST)
    @ResponseBody
    public RestResponse getCgjhList(@RequestParam (required = false) String cgjhmc,
                                    @RequestParam (required = false) String qsrq,
                                    @RequestParam (required = false) String zzrq,
                                    @RequestParam (required = true) int pageNum
    ) {
        System.out.println(qsrq);
        List<QysswjXxzxTYwCgjh> cgjhList = qysswjXxzxTYwCgjhService.getYwLbwhList(cgjhmc, qsrq, zzrq, pageNum,
                pageSize);
        if (cgjhList != null) {
            return RestResponse.success(cgjhList);
        } else {
            return RestResponse.failed(ApiReturnCodeEnum.saveFail);
        }

    }


    @ApiOperation (value = "智能生成采购计划", notes = "获取数据库中库存量少于阀值的数据")
    @RequestMapping (value = "/createCgjh", method = RequestMethod.POST)
    @ResponseBody
    public RestResponse createCgjh() {

        List<QysswjXxzxTYwLbwh> ywLbwhAuto = qysswjXxzxTYwLbwhService.getLbwhListAuto();

        if (ywLbwhAuto != null) {
            return RestResponse.success(ywLbwhAuto);
        } else {
            return RestResponse.failed(ApiReturnCodeEnum.saveFail);
        }
    }

    @ApiOperation (value = "新增后保存采购计划", notes = "保存数据库")
    @RequestMapping (value = "/saveCgjh", method = RequestMethod.POST)
    @ResponseBody
    public RestResponse saveCgjh(@RequestParam (required = false) String idNum,
                                 @RequestParam (required = false) String title
                                 /*@RequestParam (required = false) int zsl,
                                 @RequestParam (required = false) double zje*/) {


        QysswjXxzxTYwCgjh qysswjXxzxTYwCgjh = new QysswjXxzxTYwCgjh();
        qysswjXxzxTYwCgjh.setCgjhmc(title);
//        qysswjXxzxTYwCgjh.setZsl(zsl);
//        qysswjXxzxTYwCgjh.setZje(zje);

        Integer cgjhId2 = qysswjXxzxTYwCgjhService.addCgjh(qysswjXxzxTYwCgjh);
        int cgjhid = qysswjXxzxTYwCgjh.getId();

        boolean flag = true;
        if (qysswjXxzxTYwCgjh != null) {

            if (idNum != null) {

                String idNumArr[] = idNum.split(",");
                QysswjXxzxTYwLbwh qysswjXxzxTYwLbwh;

//保存采购计划详情
                for(int i = 0; i < idNumArr.length; i++) {
                    qysswjXxzxTYwLbwh = new QysswjXxzxTYwLbwh();
                    qysswjXxzxTYwLbwh = qysswjXxzxTYwLbwhService.getYwLbwhById(idNumArr[i].split("---")[0]);
                    if (flag) {
                        flag = qysswjXxzxTYwCgjhxqService.addCgjhXq(cgjhid, qysswjXxzxTYwLbwh,
                                new Integer(idNumArr[i].split("---")[1]));
                    }
                }

            }


        }

        if (flag) {
            return RestResponse.success(flag);
        } else {
            return RestResponse.failed(ApiReturnCodeEnum.saveFail);
        }


    }


    @ApiOperation (value = "获取所有采购计划的数据量 ")
    @ApiResponse (code = 400, message = "参数没有填好", response = String.class)
    @RequestMapping (value = "/getCount", method = RequestMethod.POST)
    @ResponseBody
    public RestResponse getCount() {

        int countNum = qysswjXxzxTYwCgjhService.getCount();
        if (countNum >= 0) {
            return RestResponse.success(countNum);
        } else {
            return RestResponse.failed(ApiReturnCodeEnum.saveFail);

        }

    }


    @ApiOperation (value = "更新采购计划的状态 ")
    @ApiResponse (code = 400, message = "参数没有填好", response = String.class)
    @RequestMapping (value = "/editCgjhZt", method = RequestMethod.POST)
    @ResponseBody
    public RestResponse editCgjhZt(@RequestParam (required = false) String id) {


        boolean flag = qysswjXxzxTYwCgjhService.editCgjhZt(id);


        List<QysswjXxzxTYwCgjhxq> cgjhxqList = new ArrayList<>();

        cgjhxqList = qysswjXxzxTYwCgjhxqService.getCgjhxqByCgjhid(id);

        boolean flag2 = true;

        if (cgjhxqList != null) {
            for(int i = 0; i < cgjhxqList.size(); i++) {
                flag2 = qysswjXxzxTYwLbwhService.editYwLbwh(String.valueOf(cgjhxqList.get(i).getLbid()), "", "", "",
                        null, null,
                        cgjhxqList.get(i).getCgsl(), "2");
            }
        }

        if (flag && flag2) {
            return RestResponse.success(flag);
        } else {
            return RestResponse.failed(ApiReturnCodeEnum.saveFail);

        }

    }


    @ApiOperation (value = "导出Excel", notes = "导出Excel")
    @RequestMapping (value = "/expExcel", method = RequestMethod.POST)
    @ResponseBody
    public void expExcel(@RequestParam (required = false) String cgjhid, HttpServletResponse response) throws IOException {


        List<String> titleList = new ArrayList<>();
        List<QysswjXxzxTYwLbwh> lbwhList = new ArrayList<>();

        titleList.add("类型");
        titleList.add("品牌");
        titleList.add("型号");
        titleList.add("类别");
        titleList.add("数量");
        titleList.add("单价");


        ExcelUtil.exportExcel("", titleList, null, response);

    }


}

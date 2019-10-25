package com.ihyht.alyxjs.kfzpt.portal.console;

import com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.model.QysswjXxzxTYwLbwh;
import com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.service.QysswjXxzxTYwLbwhService;
import com.ihyht.alyxjs.nbjcpt.common.api.ApiReturnCodeEnum;
import com.ihyht.commons.lang.model.RestResponse;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * (QysswjXxzxTYwLbwh)表控制层
 *
 * @author makejava
 * @since 2019-09-21 10:03:42
 */
@Api (value = "耗材管理", description = "类别维护类")
@PropertySource ("classpath:application.properties")
@RequestMapping ("/Lbwh")
@RestController
public class QysswjXxzxTYwLbwhController {
    /**
     * 服务对象
     */
    @Resource
    private QysswjXxzxTYwLbwhService qysswjXxzxTYwLbwhService;

    private List<QysswjXxzxTYwLbwh> ywLbwhList;

    @Value ("${pageSize}")
    private int pageSize;


    @ApiOperation (value = "获取所有在用类别，并且分页.页面显示数据", notes = "1.返回List。2.页码大于0,整数,分页")
    @ApiImplicitParams ({
            @ApiImplicitParam (name = "lxid", value = "类型id,下拉获取", paramType = "query", required = false),
            @ApiImplicitParam (name = "ppid", value = "品牌id，下拉获取", paramType = "query", required = false),
            @ApiImplicitParam (name = "xhid", value = "型号id，下拉获取", paramType = "query", required = false),
            @ApiImplicitParam (name = "lbmc", value = "类别名称", paramType = "query", required = false),
            @ApiImplicitParam (name = "kcl", value = "数量", paramType = "query", required = false),
            @ApiImplicitParam (name = "pageNum", value = "页码", paramType = "query", required = true)
    })
    @ApiResponse (code = 400, message = "参数没有填好", response = String.class)
    @RequestMapping (value = "/getYwLbwhList", method = RequestMethod.POST)
    @ResponseBody
    public RestResponse getYwLbwhList(@RequestParam (required = false) String lxid,
                                      @RequestParam (required = false) String ppid,
                                      @RequestParam (required = false) String xhid,
                                      @RequestParam (required = false) String lbmc,
                                      @RequestParam (required = false) Integer kcl,
                                      @RequestParam (required = true) int pageNum) {
        List<QysswjXxzxTYwLbwh> ywLbwhList = qysswjXxzxTYwLbwhService.getYwLbwhList(lxid, ppid, xhid, lbmc, kcl,
                pageNum, pageSize);
        if (ywLbwhList != null) {
            return RestResponse.success(ywLbwhList);
        } else {
            return RestResponse.failed(ApiReturnCodeEnum.saveFail);
        }
    }


    @ApiOperation (value = "新增保存", notes = "返回字符串，成功返回success，失败返回error")
    @ApiImplicitParams ({
            @ApiImplicitParam (name = "xhid", value = "型号id", paramType = "query", required = true),
            @ApiImplicitParam (name = "xhmc", value = "型号名称", paramType = "query", required = true),
            @ApiImplicitParam (name = "lbmc", value = "类别名称", paramType = "query", required = true),
            @ApiImplicitParam (name = "fz", value = "阀值", paramType = "query", required = true),
            @ApiImplicitParam (name = "ysdj", value = "预算单价", paramType = "query", required = true),
            @ApiImplicitParam (name = "kcl", value = "库存量", paramType = "query", required = true)

    })
    @ApiResponse (code = 400, message = "参数没有填好", response = String.class)
    @RequestMapping (value = "/addYwLbwh", method = RequestMethod.POST)
    @ResponseBody
    public RestResponse addYwLbwh(@RequestParam (required = true) String xhid,
                                  @RequestParam (required = true) String xhmc,
                                  @RequestParam (required = true) String lbmc,
                                  @RequestParam (required = true) Integer fz,
                                  @RequestParam (required = true) Double ysdj,
                                  @RequestParam (required = true) Integer kcl) {
        boolean flag = qysswjXxzxTYwLbwhService.addYwLbwh(xhid, xhmc, lbmc, fz, ysdj, kcl);

        if (flag) {
            return RestResponse.success(flag);
        } else {
            return RestResponse.failed(ApiReturnCodeEnum.saveFail);
        }
    }


    @ApiOperation (value = "单个删除和批量删除", notes = "实际上是更新状态。返回字符串，成功返回success，失败返回error")
    @ApiImplicitParams (
            {
                    @ApiImplicitParam (name = "ids", value = "主键id的字符串。格式：id1，id2，idn", paramType = "query", required
                            = true)
            }
    )
    @ApiResponse (code = 400, message = "参数没有填好", response = String.class)
    @RequestMapping (value = "/editYwLbwhZt", method = RequestMethod.POST)
    @ResponseBody
    public RestResponse editYwLbwhZt(@RequestParam (required = true) String ids) {

        List<String> idList = new ArrayList<>();
        try {
            String idArr[] = ids.split(",");
            idList = Arrays.asList(idArr);
        } catch (Exception e) {
            e.printStackTrace();
        }

        boolean flag = qysswjXxzxTYwLbwhService.editYwLbwhZt(idList);
        if (flag) {
            return RestResponse.success(flag);
        } else {
            return RestResponse.failed(ApiReturnCodeEnum.saveFail);
        }
    }


    @ApiOperation (value = "根据id获取类别", notes = "返回QysswjXxzxTYwLbwh对象")
    @ApiImplicitParams ({
            @ApiImplicitParam (name = "id", value = "id", paramType = "query", required = true)
    })
    @ApiResponse (code = 400, message = "参数没有填好", response = String.class)
    @RequestMapping (value = "/getYwLbwhById", method = RequestMethod.POST)
    @ResponseBody
    public RestResponse getYwLbwhById(@RequestParam (required = true) String id) {
        QysswjXxzxTYwLbwh ywLbwh = qysswjXxzxTYwLbwhService.getYwLbwhById(id);

        if (ywLbwh != null) {
            return RestResponse.success(ywLbwh);
        } else {
            return RestResponse.failed(ApiReturnCodeEnum.saveFail);
        }
    }

    @ApiOperation (value = "修改后保存", notes = "修改后保存")
    @ApiImplicitParams ({
            @ApiImplicitParam (name = "id", value = "id", paramType = "query", required = true)
    })
    @ApiResponse (code = 400, message = "参数没有填好", response = String.class)
    @RequestMapping (value = "/editYwLbwh", method = RequestMethod.POST)
    @ResponseBody
    public RestResponse editYwLbwh(@RequestParam (required = true) String id,
                                   @RequestParam (required = false) String xhid,
                                   @RequestParam (required = false) String xhmc,
                                   @RequestParam (required = false) String lbmc,
                                   @RequestParam (required = false) Integer fz,
                                   @RequestParam (required = false) Double ysdj,
                                   @RequestParam (required = false) Integer kcl
    ) {

        boolean flag = qysswjXxzxTYwLbwhService.editYwLbwh(id, xhid, xhmc, lbmc, fz, ysdj, kcl);
        if (flag) {
            return RestResponse.success(flag);
        } else {
            return RestResponse.failed(ApiReturnCodeEnum.saveFail);
        }

    }


    @ApiOperation (value = "获取所有在用类别的数据量 ")
    @ApiResponse (code = 400, message = "参数没有填好", response = String.class)
    @RequestMapping (value = "/getCount", method = RequestMethod.POST)
    @ResponseBody
    public RestResponse getCount() {

        int countNum = qysswjXxzxTYwLbwhService.getCount();
        if (countNum >= 0) {
            return RestResponse.success(countNum);
        } else {
            return RestResponse.failed(ApiReturnCodeEnum.saveFail);

        }

    }

    @ApiOperation (value = "同时根据多个id获取数据")
    @ApiImplicitParams ({
            @ApiImplicitParam (name = "ids", value = "主键id的字符串。格式：id1,id2,idn", paramType = "query", required = true)
    })
    @ApiResponse (code = 400, message = "参数没有填好", response = String.class)
    @RequestMapping (value = "/getLbwhByIds", method = RequestMethod.POST)
    @ResponseBody
    public RestResponse getLbwhByIds(@RequestParam (required = false) String ids) {

        List<QysswjXxzxTYwLbwh> ywLbwhList = new ArrayList<>();
        QysswjXxzxTYwLbwh qysswjXxzxTYwLbwh;
        if (!"".equals(ids)) {
            String idsArr[] = ids.split(",");
            if (idsArr.length > 0) {
                for(int i = 0; i < idsArr.length; i++) {
                    qysswjXxzxTYwLbwh = qysswjXxzxTYwLbwhService.getYwLbwhById(idsArr[i]);
                    if (qysswjXxzxTYwLbwh != null) {
                        ywLbwhList.add(qysswjXxzxTYwLbwh);
                    }
                }

            }
        }

        if (ywLbwhList != null) {
            return RestResponse.success(ywLbwhList);
        } else {
            return RestResponse.failed(ApiReturnCodeEnum.saveFail);

        }

    }


}

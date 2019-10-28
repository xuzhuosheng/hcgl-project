package com.ihyht.alyxjs.kfzpt.portal.console.caigou;

import com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.model.QysswjXxzxTYwCgjhxq;
import com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.service.QysswjXxzxTYwCgjhxqService;
import com.ihyht.alyxjs.nbjcpt.common.api.ApiReturnCodeEnum;
import com.ihyht.commons.lang.model.RestResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * (QysswjXxzxTYwCgjhxq)表控制层
 *
 * @author makejava
 * @since 2019-10-21 11:47:29
 */
@RestController
@RequestMapping ("/Cgjhxq")
@Api (value = "采购计划详情", description = "采购计划详情")
@PropertySource ("classpath:application.properties")
public class QysswjXxzxTYwCgjhxqController {
    /**
     * 服务对象
     */
    @Resource
    private QysswjXxzxTYwCgjhxqService qysswjXxzxTYwCgjhxqService;


    @ApiOperation (value = "新增后保存采购计划", notes = "保存数据库")
    @RequestMapping (value = "/getCgjhxqByCgjhid", method = RequestMethod.POST)
    @ResponseBody
    public RestResponse getCgjhxqByCgjhid(@RequestParam (required = false
    ) String cgjhid) {

        List<QysswjXxzxTYwCgjhxq> qysswjXxzxTYwCgjhxqList = new ArrayList<>();
        qysswjXxzxTYwCgjhxqList=qysswjXxzxTYwCgjhxqService.getCgjhxqByCgjhid(cgjhid);

        if (qysswjXxzxTYwCgjhxqList != null) {
            return RestResponse.success(qysswjXxzxTYwCgjhxqList);
        } else {
            return RestResponse.failed(ApiReturnCodeEnum.saveFail);
        }

    }


}

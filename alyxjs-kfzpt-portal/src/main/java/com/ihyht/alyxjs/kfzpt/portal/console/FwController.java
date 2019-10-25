package com.ihyht.alyxjs.kfzpt.portal.console;

import com.github.pagehelper.PageInfo;
import com.ihyht.alyxjs.kfzpt.portal.base.AbstractRestController;
import com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.model.Fw;
import com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.service.FwService;
import com.ihyht.alyxjs.nbjcpt.common.api.ApiReturnCodeEnum;
import com.ihyht.commons.lang.model.RestResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
* Created by lilingfeng on 2017/9/8.
*/
@Api(value = "Fw",description="Fw")
@RestController
@RequestMapping("/rest/fw")
public class FwController extends AbstractRestController {

    @Autowired
    private FwService fwService;


    @RequestMapping(path="",method = RequestMethod.PUT)
    @ApiOperation(value = "增加")
    public RestResponse addFw(@RequestBody Fw fw) {
        Boolean flag = fwService.addFw(fw);
        if(flag){
            return  RestResponse.success(flag);
        }else{
            return  RestResponse.failed(ApiReturnCodeEnum.saveFail);
        }
    }

    @RequestMapping(path="/{id}",method = RequestMethod.GET)
    @ApiOperation(value = "通过id标识查找")
    public RestResponse findById(@PathVariable String id) {
        Fw fw = fwService.findById(id);
        if(fw!=null){
            return  RestResponse.success(fw);
        }else{
            return  RestResponse.failed(ApiReturnCodeEnum.queryFail);
        }
    }

    @RequestMapping(path="/{id}",method = RequestMethod.DELETE)
    @ApiOperation(value = "通过id标识删除")
    public RestResponse deleteCeShiById(@PathVariable String id) {
        Boolean flag = fwService.deleteFwById(id);
        if(flag){
            return  RestResponse.success(flag);
        }else{
            return  RestResponse.failed(ApiReturnCodeEnum.deleteFail);
        }
    }

    @RequestMapping(path="",method = RequestMethod.POST)
    @ApiOperation(value = "更新")
    public RestResponse updateCeShi(@RequestBody Fw ceShi) {
        Boolean flag = fwService.updateFw(ceShi);
        if(flag){
            return  RestResponse.success(flag);
        }else{
            return  RestResponse.failed(ApiReturnCodeEnum.updateFail);
        }
    }

    @RequestMapping(path="/plist",method = RequestMethod.GET)
    @ApiOperation(value = "分页带条件查询")
    public RestResponse selectCeShiByExample(@ModelAttribute Fw fw, @RequestParam(defaultValue = "1") Integer pageNo, @RequestParam(defaultValue = "20") Integer pageSize){
        PageInfo p = fwService.selectFwByExample(fw,pageNo,pageSize);
        if(p!=null){
            return  RestResponse.success(p);
        }else{
            return  RestResponse.failed(ApiReturnCodeEnum.queryFail);
        }
    }

    @RequestMapping(path="/list",method = RequestMethod.GET)
    @ApiOperation(value = "查询全部数据")
    public RestResponse selectAll(){
        List<Fw> list = fwService.selectAll();
        if(list!=null){
            return  RestResponse.success(list);
        }else{
            return  RestResponse.failed(ApiReturnCodeEnum.queryFail);
        }
    }
}

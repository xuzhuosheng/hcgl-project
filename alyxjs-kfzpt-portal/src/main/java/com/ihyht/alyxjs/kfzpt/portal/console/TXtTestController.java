package com.ihyht.alyxjs.kfzpt.portal.console;


import com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.model.TXtTest;
import com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.service.TXtTestService;
import com.ihyht.alyxjs.nbjcpt.common.api.ApiReturnCodeEnum;
import com.ihyht.commons.lang.model.RestResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Api (value = "Test", description = "Test")
@RestController
@RequestMapping ("/Te")
public class TXtTestController {

    @Autowired
    private TXtTestService tXtTestService;

    @RequestMapping (path = "/{id}", method = RequestMethod.GET)
    @ApiOperation (value = "通过id标识查找")
    public RestResponse findById(@PathVariable String id) {
        TXtTest tXtTest = tXtTestService.findById(id);
        if (tXtTest != null) {
            return RestResponse.success(tXtTest);
        } else {
            return RestResponse.failed(ApiReturnCodeEnum.queryFail);
        }
    }

    @RequestMapping (path = "/doLogin", method = RequestMethod.POST)
    @ApiOperation (value = "登录方法")
    public RestResponse doLogin(@RequestParam (required = true) String username,
                                @RequestParam (required = true) String password) {


        System.out.println(username + "---" + password + ":" + System.currentTimeMillis());


        Map<String, String> resultMa = new HashMap<>();

        resultMa.put("token", username + "---" + password + ":" + System.currentTimeMillis());
        if ("admin".equals(username) && "123".equals(password)) {
            return RestResponse.success(resultMa);
        } else {
            return RestResponse.failed(ApiReturnCodeEnum.saveFail);
        }


    }


}

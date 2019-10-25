package com.ihyht.alyxjs.kfzpt.portal.console;


import com.ihyht.alyxjs.nbjcpt.common.api.ApiReturnCodeEnum;
import com.ihyht.commons.lang.model.RestResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.web.bind.annotation.*;

@Api(value = "登录方法", description = "login")
@RestController
@RequestMapping("/login")
public class LoginController {

    @ApiOperation(value = "登录方法 ", notes = "登录方法 ")
    @ApiResponse(code = 400, message = "参数没有填好", response = String.class)
    @RequestMapping(value = "/doLogin", method = RequestMethod.POST)
    @ResponseBody
    public RestResponse doLogin(@RequestParam String username, @RequestParam String password) {
        String mes = username + "-----" + password;
        if ("admin".equals(username) && "123456".equals(password)) {
            return RestResponse.success(mes);
        } else {
            return RestResponse.failed(ApiReturnCodeEnum.saveFail);
        }
    }

    @ApiOperation(value = "登录方法 ", notes = "登录方法 ")
    @ApiResponse(code = 400, message = "参数没有填好", response = String.class)
    @RequestMapping(value = "/doLogin2", method = RequestMethod.POST)
    @ResponseBody
    public String doLogin2() {
        System.out.println("this is doLogin 2 :" + System.currentTimeMillis());
        return "2222";
    }


}

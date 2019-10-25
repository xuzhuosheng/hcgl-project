package com.ihyht.alyxjs.kfzpt.portal;

import com.ihyht.alyxjs.kfzpt.service.portal.PortalServiceConfig;
import com.ihyht.alyxjs.nbjcpt.component.auth2.Oauth2Config;
import com.ihyht.alyxjs.nbjcpt.component.dao.mybatis.DaoMybatisConfig;
import com.ihyht.alyxjs.nbjcpt.component.swagger.SwaggerConfig;
import com.ihyht.alyxjs.wfw.component.cache.redis.FrameworkCacheConfig;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import java.text.SimpleDateFormat;
import java.util.Date;


@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableHystrixDashboard
@EnableHystrix
@Import({
        SwaggerConfig.class
        ,Oauth2Config.class
        ,PortalServiceConfig.class
        ,DaoMybatisConfig.class
        ,FrameworkCacheConfig.class
//        , ApplicationServiceConfig.class
})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    @InitBinder
    public void initBinder(ServletRequestDataBinder bin){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        CustomDateEditor cust = new CustomDateEditor(sdf,true);
        bin.registerCustomEditor(Date.class,cust);
    }
}

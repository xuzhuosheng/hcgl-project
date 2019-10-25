package com.ihyht.alyxjs.kfzpt.portal.base;

import com.ihyht.alyxjs.wfw.auth.api.BaseUser;
import com.ihyht.commons.lang.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.resource.UserInfoTokenServices;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationDetails;
import org.springframework.security.oauth2.provider.token.ResourceServerTokenServices;

import java.util.Map;

/**
 * Created by zxbking on 2019/4/7.
 */
public abstract class AbstractRestController {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    protected ResourceServerTokenServices serverTokenServices;
    @Autowired
    protected UserInfoTokenServices userInfoTokenServices;
    public String getToken() {
        SecurityContext securityContext = SecurityContextHolder.getContext();
        Authentication authentication = securityContext.getAuthentication();
        if (authentication != null && authentication.getDetails() instanceof OAuth2AuthenticationDetails) {
            OAuth2AuthenticationDetails details = (OAuth2AuthenticationDetails) authentication.getDetails();
            return details.getTokenValue();
        }
        return "";
    }
    public BaseUser getUserInfo(){
        OAuth2Authentication oAuth2Authentication = userInfoTokenServices.loadAuthentication(getToken());
        String name = oAuth2Authentication.getName();
        Authentication authentication = oAuth2Authentication.getUserAuthentication();
        Map object = (Map)((Map)((Map)authentication.getDetails()).get("principal")).get("baseUser");
        BaseUser user = BeanUtils.mapToObject(BaseUser.class,object);
        logger.info("当前用户{}的用户信息{}",name,user);
        return user;
    }
}

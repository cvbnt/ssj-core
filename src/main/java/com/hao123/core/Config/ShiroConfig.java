package com.hao123.core.Config;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class ShiroConfig {
    //    ShiroFilterFactoryBean
//    DefaultWebSecurityManager
//    realm，自定义
    @Bean
    public UserRealm userRealm() {
        return new UserRealm();
    }

    @Bean(name = "securityManager")
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("userRealm") UserRealm userRealm) {
        DefaultWebSecurityManager defaultWebSecurityManager = new DefaultWebSecurityManager();
//       关联realm
        defaultWebSecurityManager.setRealm(userRealm);
        return defaultWebSecurityManager;
    }
    //设置安全管理器
    @Bean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("securityManager") DefaultWebSecurityManager defaultWebSecurityManager) {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(defaultWebSecurityManager);
        /*添加shiro的内置过滤器*/
//        anno:无需认证
//        authc:认证访问
//        user:必须拥有 记住我 才能用
//        perms:拥有对某个资源的权限才能用
//        role:拥有某个角色权限才能访问
        Map<String,String> filterMap=new LinkedHashMap<>();
        filterMap.put("/pages/*","authc");
        //对应链接设置过滤器
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterMap);
        shiroFilterFactoryBean.setLoginUrl("/index");
        //设置登录界面链接
        return shiroFilterFactoryBean;
    }
}


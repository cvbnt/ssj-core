package com.hao123.core.Config;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

public class UserRealm extends AuthorizingRealm {
    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("执行了授权");
        return null;
    }
    //认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("执行了认证");
        String name="root";
        String password="123456";
        //自定义用户名密码
        UsernamePasswordToken userToken=(UsernamePasswordToken) authenticationToken;
        if (!userToken.getUsername().equals(name)){
            //判断
            return null;
            //抛出异常 UnknownAccountException
        }
//        密码认证,shiro做
        return new SimpleAuthenticationInfo("",password,"");
    }
}


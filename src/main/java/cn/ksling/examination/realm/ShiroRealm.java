package cn.ksling.examination.realm;

import cn.ksling.examination.entity.User;
import cn.ksling.examination.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;


public class ShiroRealm extends AuthorizingRealm {
    @Autowired
    private UserService userService;

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        // 获取token
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String username = token.getUsername();
        User user = userService.queryUserByUsername(username);
        if (null == user) {
            throw  new UnknownAccountException();
        }

        return  new SimpleAuthenticationInfo(username, user.getPassword(), getName());
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        String username = (String) principalCollection.getPrimaryPrincipal();
        User user = userService.queryUserByUsername(username);
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        if(1 == user.getPermission()) {
            info.addRole("admin");
            info.addRole("user");
            session.setAttribute("loginUser","admin");
        }
        if(2 == user.getPermission()) {
            info.addRole("user");
            session.setAttribute("loginUser","user");
        }

        return info;
    }
}

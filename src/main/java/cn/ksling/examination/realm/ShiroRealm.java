package cn.ksling.examination.realm;

import cn.ksling.examination.entity.User;
import cn.ksling.examination.service.PermissionService;
import cn.ksling.examination.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class ShiroRealm extends AuthorizingRealm {
    @Autowired
    private UserService userService;
    @Autowired
    private PermissionService permissionService;

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
        if(1 == user.getRole() || 2 == user.getRole()) {
            info.addRole("admin");
            info.addRole("user");
            List<String> permissions = permissionService.queryPermissionByUserId(user.getId());
            for (String p : permissions) {
                info.addStringPermission(p);
            }
        }
        if(3 == user.getRole()) {
            info.addRole("user");
        }

        return info;
    }
}

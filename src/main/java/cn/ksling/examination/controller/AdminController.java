package cn.ksling.examination.controller;

import cn.ksling.examination.entity.Msg;
import cn.ksling.examination.entity.Permission;
import cn.ksling.examination.entity.Theme;
import cn.ksling.examination.entity.User;
import cn.ksling.examination.service.PermissionService;
import cn.ksling.examination.service.UserService;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private UserService userService;
    @Autowired
    private PermissionService permissionService;

    @GetMapping("/editAdminPwd")
    public ModelAndView editAdminPwd(HttpSession httpSession) {
        ModelAndView modelAndView = new ModelAndView();
        Theme theme = (Theme) httpSession.getAttribute("theme");

        modelAndView.addObject("pageTopBarInfo","修改管理员密码");
        modelAndView.addObject("activeUrl1","userActive");
        modelAndView.addObject("activeUrl2","editAdminPwdActive");
        modelAndView.addObject("theme",theme);
        modelAndView.setViewName("/admin/user/editAdminPwd");

        return modelAndView;
    }

    @PutMapping("/editAdminPwdByPwd")
    public Msg editAdminPwdByUsername(HttpServletRequest request, HttpSession httpSession){
        String oldPwd = request.getParameter("oldPwd");
        String newPwd = request.getParameter("newPwd");
        SimpleHash oldPwdHash = new SimpleHash("md5", oldPwd, "ksl", 2);
        User user = userService.queryUserByPwd(oldPwdHash.toString());
        if(null == user) {

            return Msg.fail();
        }
        SimpleHash newPwdHash = new SimpleHash("md5", newPwd, "ksl", 2);
        user.setPassword(newPwdHash.toString());
        Integer res = userService.editUserByEntity(user);
        if (1 == res) {

            httpSession.setAttribute("loginUser", user);
            return Msg.success();
        }

        return Msg.fail();
    }

    @GetMapping("/permission")
    public ModelAndView permission(HttpSession httpSession) {
        ModelAndView modelAndView = new ModelAndView();
        Theme theme = (Theme) httpSession.getAttribute("theme");

        modelAndView.addObject("pageTopBarInfo","设置用户权限");
        modelAndView.addObject("activeUrl1","userActive");
        modelAndView.addObject("activeUrl2","permissionActive");
        modelAndView.addObject("theme",theme);
        modelAndView.setViewName("/admin/user/permission");

        return modelAndView;
    }

    @PutMapping("/editUserPermissions")
    public Msg editUserPermissions(Integer userId, String permissions){
        if(1 == userId) {
            return Msg.fail();
        }
        String[] strings = permissions.split(";");
        permissionService.removePermissionByUserId(userId);
        for (String s : strings) {
            Permission permission = new Permission();
            permission.setUserId(userId);
            permission.setPermission(s);
            permissionService.addPermissionByEntity(permission);
        }

        return Msg.success();
    }
}

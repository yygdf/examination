package cn.ksling.examination.controller;

import cn.ksling.examination.entity.Msg;
import cn.ksling.examination.entity.Theme;
import cn.ksling.examination.entity.User;
import cn.ksling.examination.service.UserService;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private UserService userService;

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
}

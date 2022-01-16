package cn.ksling.examination.controller;

import cn.ksling.examination.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/admin")
public class adminController {
    // 管理员首页
    @GetMapping("/index")
    public ModelAndView toAdminIndex(HttpSession session) {
        ModelAndView modelAndView = new ModelAndView();
        User user = (User) session.getAttribute("loginUser");
        modelAndView.addObject("username",user.getUsername());
        modelAndView.setViewName("/admin/index");

        return modelAndView;
    }

}

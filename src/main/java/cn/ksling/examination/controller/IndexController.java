package cn.ksling.examination.controller;

import cn.ksling.examination.entity.News;
import cn.ksling.examination.entity.Theme;
import cn.ksling.examination.entity.User;
import cn.ksling.examination.service.NewsService;
import cn.ksling.examination.service.ThemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class IndexController {
    @Autowired
    private NewsService newsService;
    @Autowired
    private ThemeService themeService;

    // 跳转首页
    @GetMapping("/toIndex")
    public ModelAndView toIndex(HttpSession httpSession) {
        if (null == httpSession.getAttribute("loginUser")) {
            return new ModelAndView("/login");
        }
        User user = (User) httpSession.getAttribute("loginUser");
        if ("admin" != user.getUsername()){
            return new ModelAndView("redirect:/user/index");
        }
        if ("admin" == user.getUsername()){
            return new ModelAndView("redirect:/admin/index");
        }

        return new ModelAndView("login");
    }

    // 系统首页
    @GetMapping("/admin/index")
    public ModelAndView toAdminIndex(HttpSession httpSession) {
        ModelAndView modelAndView = new ModelAndView();
        List<News> list =newsService.queryNews();
        User user = (User) httpSession.getAttribute("loginUser");
        Theme theme = themeService.queryThemeByUsername(user.getUsername());
        httpSession.setAttribute("theme", theme);

        modelAndView.addObject("newsList",list);
        modelAndView.addObject("pageTopBarInfo","系统首页");
        modelAndView.addObject("activeUrl","indexActive");
        modelAndView.addObject("theme",theme);
        modelAndView.setViewName("/admin/index");

        return modelAndView;
    }
}

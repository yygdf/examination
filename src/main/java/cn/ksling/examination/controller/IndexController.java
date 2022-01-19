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

    // 系统首页
    @GetMapping("/index")
    public ModelAndView toAdminIndex(HttpSession httpSession) {
        ModelAndView modelAndView = new ModelAndView();
        List<News> list =newsService.queryNews();
        User user = (User) httpSession.getAttribute("loginUser");
        if(null == user) {
            modelAndView.setViewName("/login");

            return modelAndView;
        }
        Theme theme = themeService.queryThemeByUsername(user.getUsername());
        httpSession.setAttribute("theme", theme);

        modelAndView.addObject("newsList",list);
        modelAndView.addObject("pageTopBarInfo","系统首页");
        modelAndView.addObject("activeUrl","indexActive");
        modelAndView.addObject("theme",theme);
        modelAndView.setViewName("/common/index");

        return modelAndView;
    }
}

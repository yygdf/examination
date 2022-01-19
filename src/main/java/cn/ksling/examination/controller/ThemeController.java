package cn.ksling.examination.controller;

import cn.ksling.examination.entity.Theme;
import cn.ksling.examination.service.ThemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ThemeController {
    @Autowired
    private ThemeService themeService;

    @PostMapping("/theme")
    public ModelAndView editTheme(String site_theme, String logo_bg, String header_bg, String sidebar_bg, String username) {
        Theme theme = new Theme();
        theme.setUsername(username);
        theme.setSiteTheme(site_theme);
        theme.setLogoBg(logo_bg);
        theme.setHeaderBg(header_bg);
        theme.setSidebarBg(sidebar_bg);
        themeService.editThemeByTheme(theme);

        return new ModelAndView("redirect:/index");
    }
}

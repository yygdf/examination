package cn.ksling.examination.service;

import cn.ksling.examination.entity.Theme;

public interface ThemeService {
    // 根据用户名查询主题
    Theme queryThemeByUsername(String username);

    // 更新主题
    Integer editThemeByTheme(Theme theme);
}

package cn.ksling.examination.service.impl;

import cn.ksling.examination.entity.Theme;
import cn.ksling.examination.mapper.ThemeMapper;
import cn.ksling.examination.service.ThemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ThemeServiceImpl implements ThemeService {
    @Autowired
    private ThemeMapper themeMapper;

    @Override
    public Theme queryThemeByUsername(String username) {
        return themeMapper.selectByUsername(username);
    }

    @Override
    public Integer editThemeByTheme(Theme theme) {

        return themeMapper.updateThemeByTheme(theme);
    }

    @Override
    public Integer addUserThemeByTheme(Theme theme) {

        return themeMapper.insertSelective(theme);
    }
}

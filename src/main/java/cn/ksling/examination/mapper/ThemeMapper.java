package cn.ksling.examination.mapper;

import cn.ksling.examination.entity.Theme;

public interface ThemeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Theme record);

    int insertSelective(Theme record);

    Theme selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Theme record);

    int updateByPrimaryKey(Theme record);

    Theme selectByUsername(String username);

    Integer updateThemeByTheme(Theme theme);
}
package cn.ksling.examination.mapper;

import cn.ksling.examination.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    // 根据用户名查询用户
    User selectByUsername(String username);
}
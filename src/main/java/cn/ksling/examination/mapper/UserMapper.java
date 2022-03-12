package cn.ksling.examination.mapper;

import cn.ksling.examination.entity.User;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User selectByUsername(String username);

    List<User> selectUserByName(String name);

    User selectUserByPwd(String pwd);

    User selectUserByUsernameAndPwd(String username, String password);
}
package cn.ksling.examination.service;

import cn.ksling.examination.entity.User;

import java.util.List;

public interface UserService {
    // 根据用户名查询用户
    User queryUserByUsername(String username);

    // 更新用户状态
    Integer editUserByEntity(User user);

    // 根据用户名查询用户(模糊查询)
    List<User> queryUserByName(String name);

    // 根据用户id删除用户
    Integer removeUserById(Integer id);

    // 新增用户
    Integer addUserByEntity(User user);

    // 匹配管理员账号密码
    User queryUserByPwd(String pwd);
}

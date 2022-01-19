package cn.ksling.examination.service;

import cn.ksling.examination.entity.User;

public interface UserService {
    // 根据用户名查询用户
    User queryUserByUsername(String username);

    // 更新用户状态
    Integer editUserByEntity(User user);
}

package cn.ksling.examination.service;

import cn.ksling.examination.entity.User;

public interface UserService {
    User queryUserByUsername(String username);
}

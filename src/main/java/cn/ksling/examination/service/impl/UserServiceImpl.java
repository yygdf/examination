package cn.ksling.examination.service.impl;

import cn.ksling.examination.entity.User;
import cn.ksling.examination.mapper.UserMapper;
import cn.ksling.examination.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryUserByUsername(String username) {

        return userMapper.selectByUsername(username);
    }

    @Override
    public Integer editUserByEntity(User user) {

        return userMapper.updateByPrimaryKeySelective(user);
    }
}

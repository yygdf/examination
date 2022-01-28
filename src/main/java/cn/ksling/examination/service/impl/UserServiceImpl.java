package cn.ksling.examination.service.impl;

import cn.ksling.examination.entity.User;
import cn.ksling.examination.mapper.UserMapper;
import cn.ksling.examination.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

        return userMapper.updateByPrimaryKey(user);
    }

    @Override
    public List<User> queryUserByName(String name) {

        return userMapper.selectUserByName(name);
    }

    @Override
    public Integer removeUserById(Integer id) {

        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer addUserByEntity(User user) {

        return userMapper.insertSelective(user);
    }

    @Override
    public User queryUserByPwd(String pwd) {

        return userMapper.selectUserByPwd(pwd);
    }
}

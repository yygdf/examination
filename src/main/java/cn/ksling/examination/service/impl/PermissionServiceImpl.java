package cn.ksling.examination.service.impl;

import cn.ksling.examination.entity.Permission;
import cn.ksling.examination.mapper.PermissionMapper;
import cn.ksling.examination.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionServiceImpl implements PermissionService {
    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public Integer removePermissionByUserId(Integer userId) {

        return permissionMapper.deletePermissionByUserId(userId);
    }

    @Override
    public Integer addPermissionByEntity(Permission permission) {

        return permissionMapper.insertSelective(permission);
    }

    @Override
    public List<String> queryPermissionByUserId(Integer userId) {

        return permissionMapper.selectPermissionByUserId(userId);
    }
}

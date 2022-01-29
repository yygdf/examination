package cn.ksling.examination.service;

import cn.ksling.examination.entity.Permission;

import java.util.List;

public interface PermissionService {
    // 删除权限
    Integer removePermissionByUserId(Integer userId);

    // 增加权限
    Integer addPermissionByEntity(Permission permission);

    // 查询权限
    List<String> queryPermissionByUserId(Integer userId);
}

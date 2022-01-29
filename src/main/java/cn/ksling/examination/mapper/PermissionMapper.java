package cn.ksling.examination.mapper;

import cn.ksling.examination.entity.Permission;

import java.util.List;

public interface PermissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);

    Integer deletePermissionByUserId(Integer userId);

    List<String> selectPermissionByUserId(Integer userId);
}
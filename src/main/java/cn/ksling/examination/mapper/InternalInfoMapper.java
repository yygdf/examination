package cn.ksling.examination.mapper;

import cn.ksling.examination.entity.InternalInfo;

import java.util.List;

public interface InternalInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(InternalInfo record);

    int insertSelective(InternalInfo record);

    InternalInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(InternalInfo record);

    int updateByPrimaryKey(InternalInfo record);

    List<InternalInfo> selectInternalInfoByName(String name);

    InternalInfo selectInternalInfoByNo(Integer no);
}
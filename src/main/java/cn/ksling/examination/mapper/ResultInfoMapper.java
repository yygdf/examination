package cn.ksling.examination.mapper;

import cn.ksling.examination.entity.ResultInfo;

public interface ResultInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ResultInfo record);

    int insertSelective(ResultInfo record);

    ResultInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ResultInfo record);

    int updateByPrimaryKey(ResultInfo record);
}
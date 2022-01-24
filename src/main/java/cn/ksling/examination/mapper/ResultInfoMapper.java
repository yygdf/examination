package cn.ksling.examination.mapper;

import cn.ksling.examination.entity.ResultInfo;

import java.util.List;

public interface ResultInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ResultInfo record);

    int insertSelective(ResultInfo record);

    ResultInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ResultInfo record);

    int updateByPrimaryKey(ResultInfo record);

    List<ResultInfo> selectResultInfoByName(String name);

    ResultInfo selectResultInfoByNo(Integer no);
}
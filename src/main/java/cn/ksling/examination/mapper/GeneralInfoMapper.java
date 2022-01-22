package cn.ksling.examination.mapper;

import cn.ksling.examination.entity.*;

import java.util.List;

public interface GeneralInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GeneralInfo record);

    int insertSelective(GeneralInfo record);

    GeneralInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GeneralInfo record);

    int updateByPrimaryKey(GeneralInfo record);

    List<GeneralInfo> selectGeneralInfoByName(String name);

    Integer selectGeneralInfoByNo(Integer no);
}
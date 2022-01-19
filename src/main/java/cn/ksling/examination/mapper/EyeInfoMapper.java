package cn.ksling.examination.mapper;

import cn.ksling.examination.entity.EyeInfo;
import cn.ksling.examination.entity.GeneralInfo;

import java.util.List;

public interface EyeInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EyeInfo record);

    int insertSelective(EyeInfo record);

    EyeInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EyeInfo record);

    int updateByPrimaryKey(EyeInfo record);

    List<EyeInfo> selectEyeInfoByName(String name);
}
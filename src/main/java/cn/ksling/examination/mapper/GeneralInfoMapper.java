package cn.ksling.examination.mapper;

import cn.ksling.examination.entity.GeneralInfo;
import cn.ksling.examination.entity.GeneralInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GeneralInfoMapper {
    long countByExample(GeneralInfoExample example);

    int deleteByExample(GeneralInfoExample example);

    int deleteByPrimaryKey(Integer no);

    int insert(GeneralInfo record);

    int insertSelective(GeneralInfo record);

    List<GeneralInfo> selectByExample(GeneralInfoExample example);

    GeneralInfo selectByPrimaryKey(Integer no);

    int updateByExampleSelective(@Param("record") GeneralInfo record, @Param("example") GeneralInfoExample example);

    int updateByExample(@Param("record") GeneralInfo record, @Param("example") GeneralInfoExample example);

    int updateByPrimaryKeySelective(GeneralInfo record);

    int updateByPrimaryKey(GeneralInfo record);
}
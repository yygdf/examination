package cn.ksling.examination.mapper;

import cn.ksling.examination.entity.EyeInfo;
import cn.ksling.examination.entity.EyeInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EyeInfoMapper {
    long countByExample(EyeInfoExample example);

    int deleteByExample(EyeInfoExample example);

    int deleteByPrimaryKey(Integer no);

    int insert(EyeInfo record);

    int insertSelective(EyeInfo record);

    List<EyeInfo> selectByExample(EyeInfoExample example);

    EyeInfo selectByPrimaryKey(Integer no);

    int updateByExampleSelective(@Param("record") EyeInfo record, @Param("example") EyeInfoExample example);

    int updateByExample(@Param("record") EyeInfo record, @Param("example") EyeInfoExample example);

    int updateByPrimaryKeySelective(EyeInfo record);

    int updateByPrimaryKey(EyeInfo record);
}
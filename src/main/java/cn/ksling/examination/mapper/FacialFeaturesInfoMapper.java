package cn.ksling.examination.mapper;

import cn.ksling.examination.entity.FacialFeaturesInfo;
import cn.ksling.examination.entity.FacialFeaturesInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FacialFeaturesInfoMapper {
    long countByExample(FacialFeaturesInfoExample example);

    int deleteByExample(FacialFeaturesInfoExample example);

    int deleteByPrimaryKey(Integer no);

    int insert(FacialFeaturesInfo record);

    int insertSelective(FacialFeaturesInfo record);

    List<FacialFeaturesInfo> selectByExample(FacialFeaturesInfoExample example);

    FacialFeaturesInfo selectByPrimaryKey(Integer no);

    int updateByExampleSelective(@Param("record") FacialFeaturesInfo record, @Param("example") FacialFeaturesInfoExample example);

    int updateByExample(@Param("record") FacialFeaturesInfo record, @Param("example") FacialFeaturesInfoExample example);

    int updateByPrimaryKeySelective(FacialFeaturesInfo record);

    int updateByPrimaryKey(FacialFeaturesInfo record);
}
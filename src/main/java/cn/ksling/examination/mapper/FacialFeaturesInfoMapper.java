package cn.ksling.examination.mapper;

import cn.ksling.examination.entity.FacialFeaturesInfo;

import java.util.List;

public interface FacialFeaturesInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FacialFeaturesInfo record);

    int insertSelective(FacialFeaturesInfo record);

    FacialFeaturesInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FacialFeaturesInfo record);

    int updateByPrimaryKey(FacialFeaturesInfo record);

    List<FacialFeaturesInfo> selectFacialFeaturesInfoByName(String name);

    FacialFeaturesInfo selectFacialFeaturesInfoByNo(Integer no);
}
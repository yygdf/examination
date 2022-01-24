package cn.ksling.examination.service;

import cn.ksling.examination.entity.FacialFeaturesInfo;

import java.util.List;

public interface FacialFeaturesInfoService {
    // 查询五官科信息
    List<FacialFeaturesInfo> queryFacialFeaturesInfoByName(String name);

    // 编辑五官科信息
    Integer editFacialFeaturesInfoByEntity(FacialFeaturesInfo facialFeaturesInfo);

    // 根据学号查询五官科信息
    FacialFeaturesInfo queryFacialFeaturesInfoByNo(Integer no);
}

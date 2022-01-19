package cn.ksling.examination.service;

import cn.ksling.examination.entity.FacialFeaturesInfo;

import java.util.List;

public interface FacialFeaturesInfoService {
    // 查询五官科信息
    List<FacialFeaturesInfo> queryFacialFeaturesInfoByName(String name);
}

package cn.ksling.examination.service.impl;

import cn.ksling.examination.entity.FacialFeaturesInfo;
import cn.ksling.examination.mapper.FacialFeaturesInfoMapper;
import cn.ksling.examination.service.FacialFeaturesInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacialFeaturesInfoServiceImpl implements FacialFeaturesInfoService {
    @Autowired
    private FacialFeaturesInfoMapper facialFeaturesInfoMapper;

    @Override
    public List<FacialFeaturesInfo> queryFacialFeaturesInfoByName(String name) {

        return facialFeaturesInfoMapper.selectFacialFeaturesInfoByName(name);
    }
}

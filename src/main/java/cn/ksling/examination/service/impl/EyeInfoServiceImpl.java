package cn.ksling.examination.service.impl;

import cn.ksling.examination.entity.EyeInfo;
import cn.ksling.examination.entity.GeneralInfo;
import cn.ksling.examination.mapper.EyeInfoMapper;
import cn.ksling.examination.service.EyeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EyeInfoServiceImpl implements EyeInfoService {
    @Autowired
    private EyeInfoMapper eyeInfoMapper;
    @Override
    public List<EyeInfo> queryEyeInfoByName(String name) {

        return eyeInfoMapper.selectEyeInfoByName(name);
    }

    @Override
    public Integer editEyeInfoByEntity(EyeInfo eyeInfo) {

        return eyeInfoMapper.updateByPrimaryKeySelective(eyeInfo);
    }
}

package cn.ksling.examination.service.impl;

import cn.ksling.examination.entity.GeneralInfo;
import cn.ksling.examination.mapper.GeneralInfoMapper;
import cn.ksling.examination.service.GeneralInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneralInfoServiceImpl implements GeneralInfoService {
    @Autowired
    private GeneralInfoMapper generalInfoMapper;

    @Override
    public List<GeneralInfo> queryGeneralInfoByName(String name) {

        return generalInfoMapper.selectGeneralInfoByName(name);
    }
}

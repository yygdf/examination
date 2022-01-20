package cn.ksling.examination.service.impl;

import cn.ksling.examination.entity.SurgeryInfo;
import cn.ksling.examination.mapper.SurgeryInfoMapper;
import cn.ksling.examination.service.SurgeryInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurgeryInfoServiceImpl implements SurgeryInfoService {
    @Autowired
    private SurgeryInfoMapper surgeryInfoMapper;

    @Override
    public List<SurgeryInfo> querySurgeryInfoByName(String name) {

        return surgeryInfoMapper.selectSurgeryInfoByName(name);
    }

    @Override
    public Integer editSurgeryInfoByEntity(SurgeryInfo surgeryInfo) {

        return surgeryInfoMapper.updateByPrimaryKeySelective(surgeryInfo);
    }
}

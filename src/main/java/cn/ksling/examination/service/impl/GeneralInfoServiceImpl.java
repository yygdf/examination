package cn.ksling.examination.service.impl;

import cn.ksling.examination.entity.*;
import cn.ksling.examination.mapper.*;
import cn.ksling.examination.service.GeneralInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GeneralInfoServiceImpl implements GeneralInfoService {
    @Autowired
    private GeneralInfoMapper generalInfoMapper;
    @Autowired
    private EyeInfoMapper eyeInfoMapper;
    @Autowired
    private FacialFeaturesInfoMapper facialFeaturesInfoMapper;
    @Autowired
    private InternalInfoMapper internalInfoMapper;
    @Autowired
    private SurgeryInfoMapper surgeryInfoMapper;
    @Autowired
    private ResultInfoMapper resultInfoMapper;

    @Override
    public List<GeneralInfo> queryGeneralInfoByName(String name) {

        return generalInfoMapper.selectGeneralInfoByName(name);
    }

    @Override
    public Integer editGeneralInfoByEntity(GeneralInfo generalInfo) {

        return generalInfoMapper.updateByPrimaryKeySelective(generalInfo);
    }

    @Override
    public Integer removeGeneralInfoById(Integer id) {

        return generalInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer queryGeneralInfoByNo(Integer no) {

        return generalInfoMapper.selectGeneralInfoByNo(no);
    }

    @Transactional
    @Override
    public Integer addGeneralInfoByEntity(GeneralInfo generalInfo, EyeInfo eyeInfo, FacialFeaturesInfo facialFeaturesInfo, InternalInfo internalInfo, SurgeryInfo surgeryInfo, ResultInfo resultInfo) {

        generalInfoMapper.insertSelective(generalInfo);
        eyeInfoMapper.insertSelective(eyeInfo);
        facialFeaturesInfoMapper.insertSelective(facialFeaturesInfo);
        internalInfoMapper.insertSelective(internalInfo);
        surgeryInfoMapper.insertSelective(surgeryInfo);

        return resultInfoMapper.insertSelective(resultInfo);
    }
}

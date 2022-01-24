package cn.ksling.examination.service;

import cn.ksling.examination.entity.*;

import java.util.List;

public interface GeneralInfoService {
    // 查询新生基本信息
    List<GeneralInfo> queryGeneralInfoByName(String name);

    // 编辑新生基本信息
    Integer editGeneralInfoByEntity(GeneralInfo generalInfo);

    // 删除(注：该操作会删除所有的体检信息)
    Integer removeGeneralInfoById(Integer id);

    // 根据学号查询新生信息
    GeneralInfo queryGeneralInfoByNo(Integer no);

    // 录入新生信息
    Integer addGeneralInfoByEntity(GeneralInfo generalInfo, EyeInfo eyeInfo, FacialFeaturesInfo facialFeaturesInfo, InternalInfo internalInfo, SurgeryInfo surgeryInfo, ResultInfo resultInfo);
}

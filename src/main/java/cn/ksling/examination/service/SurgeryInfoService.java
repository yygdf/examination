package cn.ksling.examination.service;

import cn.ksling.examination.entity.SurgeryInfo;

import java.util.List;

public interface SurgeryInfoService {
    // 查询外科信息
    List<SurgeryInfo> querySurgeryInfoByName(String name);

    // 编辑外科信息
    Integer editSurgeryInfoByEntity(SurgeryInfo surgeryInfo);
}

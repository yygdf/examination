package cn.ksling.examination.service;

import cn.ksling.examination.entity.GeneralInfo;

import java.util.List;

public interface GeneralInfoService {
    // 查询新生基础信息
    List<GeneralInfo> queryGeneralInfoByName(String name);
}

package cn.ksling.examination.service;

import cn.ksling.examination.entity.EyeInfo;

import java.util.List;

public interface EyeInfoService {
    // 查询眼科信息
    List<EyeInfo> queryEyeInfoByName(String name);

    // 编辑眼科信息
    Integer editEyeInfoByEntity(EyeInfo eyeInfo);

    // 根据学号查询眼科信息
    EyeInfo queryEyeInfoByNo(Integer no);
}

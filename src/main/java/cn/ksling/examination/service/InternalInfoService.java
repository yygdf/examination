package cn.ksling.examination.service;

import cn.ksling.examination.entity.InternalInfo;

import java.util.List;

public interface InternalInfoService {
    // 查询内科信息
    List<InternalInfo> queryInternalInfoByName(String name);
}

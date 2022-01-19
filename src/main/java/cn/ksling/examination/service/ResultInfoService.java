package cn.ksling.examination.service;

import cn.ksling.examination.entity.ResultInfo;

import java.util.List;

public interface ResultInfoService {
    // 查询体检结果
    List<ResultInfo> queryResultInfoByName(String name);
}

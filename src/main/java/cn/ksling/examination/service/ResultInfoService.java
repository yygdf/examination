package cn.ksling.examination.service;

import cn.ksling.examination.entity.ResultInfo;

import java.util.List;

public interface ResultInfoService {
    // 查询体检结果
    List<ResultInfo> queryResultInfoByName(String name);

    // 编辑体检结果
    Integer editResultInfoByEntity(ResultInfo resultInfo);

    // 根据学号查询体检结果
    ResultInfo queryResultInfoByNo(Integer no);
}

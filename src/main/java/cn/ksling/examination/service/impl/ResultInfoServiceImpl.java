package cn.ksling.examination.service.impl;

import cn.ksling.examination.entity.ResultInfo;
import cn.ksling.examination.mapper.ResultInfoMapper;
import cn.ksling.examination.service.ResultInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultInfoServiceImpl implements ResultInfoService {
    @Autowired
    private ResultInfoMapper resultInfoMapper;

    @Override
    public List<ResultInfo> queryResultInfoByName(String name) {

        return resultInfoMapper.selectResultInfoByName(name);
    }

    @Override
    public Integer editResultInfoByEntity(ResultInfo resultInfo) {

        return resultInfoMapper.updateByPrimaryKeySelective(resultInfo);
    }
}

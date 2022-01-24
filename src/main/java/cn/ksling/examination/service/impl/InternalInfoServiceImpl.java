package cn.ksling.examination.service.impl;

import cn.ksling.examination.entity.InternalInfo;
import cn.ksling.examination.mapper.InternalInfoMapper;
import cn.ksling.examination.service.InternalInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InternalInfoServiceImpl implements InternalInfoService {
    @Autowired
    private InternalInfoMapper internalInfoMapper;

    @Override
    public List<InternalInfo> queryInternalInfoByName(String name) {

        return internalInfoMapper.selectInternalInfoByName(name);
    }

    @Override
    public Integer editInternalInfoByEntity(InternalInfo internalInfo) {

        return internalInfoMapper.updateByPrimaryKeySelective(internalInfo);
    }

    @Override
    public InternalInfo queryInternalInfoByNo(Integer no) {

        return internalInfoMapper.selectInternalInfoByNo(no);
    }
}

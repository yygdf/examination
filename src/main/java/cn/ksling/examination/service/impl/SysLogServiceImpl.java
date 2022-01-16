package cn.ksling.examination.service.impl;

import cn.ksling.examination.service.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysLogServiceImpl implements SysLogService {
    @Autowired
    private SysLogMapper sysLogMapper;

    @Override
    public void addSysLog(SysLog sysLog) {
        sysLogMapper.insertSelective(sysLog);
    }
}

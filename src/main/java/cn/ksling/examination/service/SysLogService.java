package cn.ksling.examination.service;

import cn.ksling.examination.entity.SysLog;

public interface SysLogService {
    // 记录日志
    void addSysLog(SysLog sysLog);
}

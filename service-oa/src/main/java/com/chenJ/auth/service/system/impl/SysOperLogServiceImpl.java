package com.chenJ.auth.service.system.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chenJ.auth.mapper.system.SysOperLogMapper;
import com.chenJ.auth.service.system.SysOperLogService;
import com.chenJ.model.system.SysOperLogDO;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chenJ
 * @Project : chenJ-oa-parent
 * @Package : com.chenJ.auth.service.system.impl
 * @ClassName : SysOperLogServiceImpl.java
 * @createTime : 2024/4/25 0:18
 * @Description :
 */
@Service
public class SysOperLogServiceImpl extends ServiceImpl<SysOperLogMapper, SysOperLogDO> implements SysOperLogService {
}

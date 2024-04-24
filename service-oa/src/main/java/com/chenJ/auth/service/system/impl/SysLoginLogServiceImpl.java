package com.chenJ.auth.service.system.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chenJ.auth.mapper.system.SysLoginLogMapper;
import com.chenJ.auth.service.system.SysLoginLogService;
import com.chenJ.model.system.SysLoginLogDO;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chenJ
 * @Project : chenJ-oa-parent
 * @Package : com.chenJ.auth.service.system.impl
 * @ClassName : SysLoginLogServiceImpl.java
 * @createTime : 2024/4/25 0:17
 * @Description :
 */
@Service
public class SysLoginLogServiceImpl extends ServiceImpl<SysLoginLogMapper, SysLoginLogDO> implements SysLoginLogService {
}

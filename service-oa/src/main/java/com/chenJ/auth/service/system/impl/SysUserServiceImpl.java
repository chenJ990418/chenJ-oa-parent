package com.chenJ.auth.service.system.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chenJ.auth.mapper.system.SysUserMapper;
import com.chenJ.auth.service.system.SysUserService;
import com.chenJ.model.system.SysUserDO;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chenJ
 * @Project : chenJ-oa-parent
 * @Package : com.chenJ.auth.service.system.impl
 * @ClassName : SysUserServiceImpl.java
 * @createTime : 2024/4/25 0:18
 * @Description :
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUserDO> implements SysUserService {
}

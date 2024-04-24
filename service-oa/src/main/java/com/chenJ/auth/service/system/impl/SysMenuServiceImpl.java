package com.chenJ.auth.service.system.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chenJ.auth.mapper.system.SysMenuMapper;
import com.chenJ.auth.service.system.SysMenuService;
import com.chenJ.model.system.SysMenuDO;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chenJ
 * @Project : chenJ-oa-parent
 * @Package : com.chenJ.auth.service.system
 * @ClassName : SysMenuService.java
 * @createTime : 2024/4/24 23:17
 * @Description :
 */
@Service
public class SysMenuServiceImpl extends ServiceImpl<SysMenuMapper, SysMenuDO> implements SysMenuService {
}

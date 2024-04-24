package com.chenJ.auth.service.system;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chenJ.model.system.SysRoleDO;
import com.chenJ.vo.system.SysRoleVO;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chenJ
 * @Project : chenJ-oa-parent
 * @Package : com.chenJ.auth.service.system
 * @ClassName : SysRoleService.java
 * @createTime : 2024/4/24 23:17
 * @Description :
 */
public interface SysRoleService extends IService<SysRoleDO> {
    List<SysRoleVO> getSysRoleList();
}

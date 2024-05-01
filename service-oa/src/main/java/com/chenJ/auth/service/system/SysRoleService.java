package com.chenJ.auth.service.system;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.chenJ.dto.system.SysRoleDTO;
import com.chenJ.dto.system.SysRoleQueryDTO;
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

    Page<List<SysRoleVO>> getSysRoleListByPage(SysRoleQueryDTO sysRoleQueryDTO);

    Boolean addOrUpdateSysRole(List<SysRoleDTO> sysRoleDTOList);

    Boolean deleteSysRoleById(String id);
}

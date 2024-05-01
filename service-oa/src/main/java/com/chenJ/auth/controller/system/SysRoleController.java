package com.chenJ.auth.controller.system;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.chenJ.auth.service.system.SysRoleService;
import com.chenJ.common.result.Result;
import com.chenJ.dto.system.SysRoleDTO;
import com.chenJ.dto.system.SysRoleQueryDTO;
import com.chenJ.model.system.SysRoleDO;
import com.chenJ.vo.system.SysRoleVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chenJ
 * @Project : chenJ-oa-parent
 * @Package : com.chenJ.auth.controller.system
 * @ClassName : SysRoleController.java
 * @createTime : 2024/4/25 0:26
 * @Description :
 */
@Api(tags = "角色管理")
@RestController
@RequestMapping("/sysRole")
public class SysRoleController {

    @Resource
    private SysRoleService sysRoleService;

    @GetMapping("/getSysRoleList")
    @ApiOperation(value = "获取所有角色")
    public Result<List<SysRoleVO>> getSysRoleList() {
        List<SysRoleVO> sysRoleList = sysRoleService.getSysRoleList();
        return Result.success(sysRoleList);
    }

    @PostMapping("/getSysRoleListByPage")
    @ApiOperation(value = "分页查询角色列表")
    public Result getSysRoleListByPage(@RequestBody SysRoleQueryDTO sysRoleQueryDTO) {// 1、创建 page 对象， 传递分页查询的参数
        // 1、调用方法实现分页查询
        Page sysRoleListByPage = sysRoleService.getSysRoleListByPage(sysRoleQueryDTO);
        return Result.success(sysRoleListByPage);
    }

    @GetMapping("/getSysRoleById/{id}")
    @ApiOperation(value = "通过ID获取角色详情")
    public Result getSysRoleById(@PathVariable String id) {
        SysRoleDO sysRole = sysRoleService.getById(id);
        return Result.success(sysRole);
    }

    @PostMapping("/addOrUpdateSysRole")
    @ApiOperation(value = "添加角色")
    public Result addOrUpdateSysRole(@RequestBody List<SysRoleDTO> sysRoleDTOList) {
        Boolean result = sysRoleService.addOrUpdateSysRole(sysRoleDTOList);
        if (result) {
            return Result.success(true);
        } else {
            return Result.fail(false);
        }
    }
    @DeleteMapping("/deleteSysRoleById/{id}")
    @ApiOperation(value = "删除角色")
    public Result deleteSysRoleById(@PathVariable String id) {
        Boolean result = sysRoleService.deleteSysRoleById(id);
        if (result) {
            return Result.success(true);
        } else {
            return Result.fail(false);
        }
    }
}

package com.chenJ.auth.controller.system;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.chenJ.auth.service.system.SysRoleService;
import com.chenJ.common.result.Result;
import com.chenJ.dto.system.SysRoleQueryDTO;
import com.chenJ.model.system.SysRoleDO;
import com.chenJ.vo.system.SysRoleVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
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
    private Result getSysRoleListByPage(@RequestBody SysRoleQueryDTO sysRoleQueryDTO) {// 1、创建 page 对象， 传递分页查询的参数
        // 1、调用方法实现分页查询
        Page sysRoleListByPage = sysRoleService.getSysRoleListByPage(sysRoleQueryDTO);
        return Result.success(sysRoleListByPage);
    }

}

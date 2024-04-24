package com.chenJ.auth.controller.system;

import com.chenJ.auth.service.system.SysRoleService;
import com.chenJ.model.system.SysRoleDO;
import com.chenJ.vo.system.SysRoleVO;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.nio.channels.Pipe;
import java.security.PublicKey;
import java.util.Collections;
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
@RestController
@RequestMapping("/sysRole")
public class SysRoleController {

    @Resource
    private SysRoleService sysRoleService;

    @GetMapping("/getSysRoleList")
    @ApiModelProperty(value = "获取角色列表")
    public List<SysRoleVO> getSysRoleList() {
        return sysRoleService.getSysRoleList();
    }

}

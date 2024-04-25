package com.chenJ.auth.service.system.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chenJ.auth.mapper.system.SysRoleMapper;
import com.chenJ.auth.service.system.SysRoleService;
import com.chenJ.dto.system.SysRoleQueryDTO;
import com.chenJ.model.system.SysRoleDO;
import com.chenJ.vo.system.SysRoleVO;
import io.jsonwebtoken.lang.Collections;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chenJ
 * @Project : chenJ-oa-parent
 * @Package : com.chenJ.auth.service.system.impl
 * @ClassName : SysRoleServiceImpl.java
 * @createTime : 2024/4/25 0:18
 * @Description :
 */
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRoleDO> implements SysRoleService {

    @Resource
    private SysRoleMapper sysRoleMapper;

    @Override
    public List<SysRoleVO> getSysRoleList() {
        List<SysRoleVO> sysRoleVoList = new ArrayList<>();
        List<SysRoleDO> sysRoleList = sysRoleMapper.selectList(null);
        if (!CollectionUtils.isEmpty(sysRoleList)) {
            sysRoleList.forEach(v -> {
                SysRoleVO sysRoleVO = new SysRoleVO();
                BeanUtils.copyProperties(v, sysRoleVO);
                sysRoleVoList.add(sysRoleVO);
            });
        }
        return sysRoleVoList;
    }

    @Override
    public Page getSysRoleListByPage(SysRoleQueryDTO sysRoleQueryDTO) {
        Page<SysRoleDO> page = new Page<>(sysRoleQueryDTO.getPageNo(), sysRoleQueryDTO.getPageSize());
        LambdaQueryWrapper<SysRoleDO> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        if (StringUtils.isNotEmpty(sysRoleQueryDTO.getRoleName())) {
            // 封装
            lambdaQueryWrapper.like(SysRoleDO::getRoleName, sysRoleQueryDTO.getRoleName());
        }
        Page<SysRoleDO> sysRoleDOPage = sysRoleMapper.selectPage(page, lambdaQueryWrapper);
        if (!Collections.isEmpty(sysRoleDOPage.getRecords())) {
            return sysRoleDOPage;
        }
        return page;
    }
}

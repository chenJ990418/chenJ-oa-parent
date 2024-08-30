package com.chenJ.auth.service.system.impl;

import cn.hutool.core.collection.CollectionUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chenJ.auth.mapper.system.SysRoleMapper;
import com.chenJ.auth.service.system.SysRoleService;
import com.chenJ.common.constants.StatusConstants;
import com.chenJ.dto.system.SysRoleDTO;
import com.chenJ.dto.system.SysRoleQueryDTO;
import com.chenJ.model.system.SysRoleDO;
import com.chenJ.vo.system.SysRoleVO;
import com.google.protobuf.ServiceException;
import io.jsonwebtoken.lang.Collections;
import lombok.SneakyThrows;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
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

    /**
     * 获取角色列表
     *
     * @return
     */
    @Override
    public List<SysRoleVO> getSysRoleList() {
        List<SysRoleVO> sysRoleVoList = new ArrayList<>();
        QueryWrapper<SysRoleDO> wrapper = new QueryWrapper<>();
        wrapper.eq("is_deleted", StatusConstants.unDeleted);
        List<SysRoleDO> sysRoleList = sysRoleMapper.selectList(wrapper);
        if (!CollectionUtils.isEmpty(sysRoleList)) {
            sysRoleList.forEach(v -> {
                SysRoleVO sysRoleVO = new SysRoleVO();
                BeanUtils.copyProperties(v, sysRoleVO);
                sysRoleVoList.add(sysRoleVO);
            });
        }
        return sysRoleVoList;
    }

    /**
     * 获取角色分页列表
     *
     * @param sysRoleQueryDTO
     * @return
     */
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

    /**
     * 添加/更新角色
     *
     * @param sysRoleDTOList
     * @return
     */
    @Override
    @SneakyThrows
    @Transactional(rollbackFor = Exception.class)
    public Boolean addOrUpdateSysRole(List<SysRoleDTO> sysRoleDTOList) {
        boolean result = false;
        if (CollectionUtil.isEmpty(sysRoleDTOList)) {
            throw new ServiceException("角色数据为空");
        }
        List<SysRoleDO> doList = new ArrayList<>();
        sysRoleDTOList.forEach(v -> {
            SysRoleDO sysRoleDO = new SysRoleDO();
            BeanUtils.copyProperties(v, sysRoleDO);
            doList.add(sysRoleDO);
        });
        if (CollectionUtil.isNotEmpty(doList)) {
            result = saveOrUpdateBatch(doList);
        }
        return result;
    }

    /**
     * 逻辑删除
     *
     * @param id
     * @return
     */
    @Override
    @SneakyThrows
    @Transactional(rollbackFor = Exception.class)
    public Boolean deleteSysRoleById(String id) {
        if (StringUtils.isBlank(id)) {
            throw new ServiceException("id不能为空");
        }
        UpdateWrapper<SysRoleDO> wrapper = new UpdateWrapper<>();
        wrapper.set("is_deleted", StatusConstants.isDeleted);
        wrapper.eq("id", id);
        return this.update(wrapper);
    }

}

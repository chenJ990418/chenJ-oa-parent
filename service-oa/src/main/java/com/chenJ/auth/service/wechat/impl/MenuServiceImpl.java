package com.chenJ.auth.service.wechat.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chenJ.auth.mapper.wechat.MenuMapper;
import com.chenJ.auth.service.wechat.MenuService;
import com.chenJ.model.wechat.MenuDO;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chenJ
 * @Project : chenJ-oa-parent
 * @Package : com.chenJ.auth.service.wechat
 * @ClassName : MenuService.java
 * @createTime : 2024/4/24 23:17
 * @Description :
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, MenuDO> implements MenuService {
}

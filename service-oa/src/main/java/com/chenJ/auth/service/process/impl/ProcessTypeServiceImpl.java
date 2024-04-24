package com.chenJ.auth.service.process.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chenJ.auth.mapper.process.ProcessTypeMapper;
import com.chenJ.auth.service.process.ProcessTypeService;
import com.chenJ.model.process.ProcessTypeDO;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chenJ
 * @Project : chenJ-oa-parent
 * @Package : com.chenJ.auth.service.process.impl
 * @ClassName : ProcessTypeServiceImpl.java
 * @createTime : 2024/4/25 0:07
 * @Description :
 */
@Service
public class ProcessTypeServiceImpl extends ServiceImpl<ProcessTypeMapper, ProcessTypeDO> implements ProcessTypeService {
}

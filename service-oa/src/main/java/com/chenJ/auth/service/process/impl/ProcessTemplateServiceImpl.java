package com.chenJ.auth.service.process.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chenJ.auth.mapper.process.ProcessTemplateMapper;
import com.chenJ.auth.service.process.ProcessTemplateService;
import com.chenJ.model.process.ProcessTemplateDO;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chenJ
 * @Project : chenJ-oa-parent
 * @Package : com.chenJ.auth.service.process.impl
 * @ClassName : ProcessTemplateServiceImpl.java
 * @createTime : 2024/4/25 0:07
 * @Description :
 */
@Service
public class ProcessTemplateServiceImpl extends ServiceImpl<ProcessTemplateMapper, ProcessTemplateDO> implements ProcessTemplateService {
}

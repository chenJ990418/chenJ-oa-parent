package com.chenJ.auth.service.process.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chenJ.auth.mapper.process.ProcessMapper;
import com.chenJ.auth.service.process.ProcessService;
import com.chenJ.model.process.ProcessDO;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chenJ
 * @Project : chenJ-oa-parent
 * @Package : com.chenJ.auth.service.process.impl
 * @ClassName : ProcessServiceImpl.java
 * @createTime : 2024/4/25 0:07
 * @Description :
 */
@Service
public class ProcessServiceImpl extends ServiceImpl<ProcessMapper, ProcessDO> implements ProcessService {
}

package com.chenJ.auth.service.process.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chenJ.auth.mapper.process.ProcessRecordMapper;
import com.chenJ.auth.service.process.ProcessRecordService;
import com.chenJ.model.process.ProcessRecordDO;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chenJ
 * @Project : chenJ-oa-parent
 * @Package : com.chenJ.auth.service.process.impl
 * @ClassName : ProcessRecordServiceImpl.java
 * @createTime : 2024/4/25 0:07
 * @Description :
 */
@Service
public class ProcessRecordServiceImpl extends ServiceImpl<ProcessRecordMapper, ProcessRecordDO> implements ProcessRecordService {
}

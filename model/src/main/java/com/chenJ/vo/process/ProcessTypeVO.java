package com.chenJ.vo.process;

import com.baomidou.mybatisplus.annotation.TableName;
import com.chenJ.model.process.ProcessTemplateDO;
import com.chenJ.model.process.ProcessTypeDO;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chenJ
 * @Project : chenJ-oa-parent
 * @Package : com.chenJ.model.process
 * @ClassName : ProcessTypeDO.java
 * @createTime : 2024/4/24 0:38
 * @Description :
 */
@Data
@ApiModel(description = "ProcessType")
@TableName("oa_process_type")
public class ProcessTypeVO extends ProcessTypeDO {

    private List<ProcessTemplateDO> processTemplateList;

}

package com.chenJ.vo.process;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.chenJ.model.process.ProcessTemplateDO;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chenJ
 * @Project : chenJ-oa-parent
 * @Package : com.chenJ.model.process
 * @ClassName : ProcessTemplateDO.java
 * @createTime : 2024/4/24 0:37
 * @Description :
 */
@Data
@ApiModel(description = "ProcessTemplate")
@TableName("oa_process_template")
public class ProcessTemplateVO extends ProcessTemplateDO {

    @TableField(exist = false)
    private String processTypeName;
}

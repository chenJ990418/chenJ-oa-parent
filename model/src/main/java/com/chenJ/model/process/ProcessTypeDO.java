package com.chenJ.model.process;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.chenJ.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

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
public class ProcessTypeDO extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "类型名称")
    @TableField("name")
    private String name;

    @ApiModelProperty(value = "描述")
    @TableField("description")
    private String description;

}

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
 * @ClassName : ProcessRecordDO.java
 * @createTime : 2024/4/24 0:36
 * @Description :
 */
@Data
@ApiModel(description = "ProcessRecord")
@TableName("oa_process_record")
public class ProcessRecordDO extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "审批流程id")
    @TableField("process_id")
    private Long processId;

    @ApiModelProperty(value = "审批描述")
    @TableField("description")
    private String description;

    @ApiModelProperty(value = "状态")
    @TableField("status")
    private Integer status;

    @ApiModelProperty(value = "操作用户id")
    @TableField("operate_user_id")
    private Long operateUserId;

    @ApiModelProperty(value = "操作用户")
    @TableField("operate_user")
    private String operateUser;

}

package com.chenJ.model.system;

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
 * @Package : com.chenJ.model.system
 * @ClassName : SysRoleDO.java
 * @createTime : 2024/4/24 0:33
 * @Description :
 */
@Data
@ApiModel(description = "角色")
@TableName("sys_role")
public class SysRoleDO extends BaseEntity {

    private static final long serialVersionUID = 1L;

//    @NotBlank(message = "角色名称不能为空")
    @ApiModelProperty(value = "角色名称")
    @TableField("role_name")
    private String roleName;

    @ApiModelProperty(value = "角色编码")
    @TableField("role_code")
    private String roleCode;

    @ApiModelProperty(value = "描述")
    @TableField("description")
    private String description;

}

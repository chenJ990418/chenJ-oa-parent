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
 * @ClassName : SysUserRoleDO.java
 * @createTime : 2024/4/24 0:34
 * @Description :
 */
@Data
@ApiModel(description = "用户角色")
@TableName("sys_user_role")
public class SysUserRoleDO extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "角色id")
    @TableField("role_id")
    private Long roleId;

    @ApiModelProperty(value = "用户id")
    @TableField("user_id")
    private Long userId;

}

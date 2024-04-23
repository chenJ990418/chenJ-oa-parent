package com.chenJ.vo.system;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.chenJ.model.system.SysUserDO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chenJ
 * @Project : chenJ-oa-parent
 * @Package : com.chenJ.model.system
 * @ClassName : SysUserDO.java
 * @createTime : 2024/4/24 0:13
 * @Description :
 */
@Data
@ApiModel(description = "用户")
@TableName(value = "sys_user")
public class SysUserVO extends SysUserDO {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户名", required = true)
    @TableField("username")
    private String username;

    @ApiModelProperty(value = "密码", required = true)
    @TableField("password")
    private String password;

    @ApiModelProperty(value = "姓名", required = true)
    @TableField("name")
    private String name;

    @ApiModelProperty(value = "手机", required = true)
    @TableField("phone")
    private String phone;

    @ApiModelProperty(value = "头像地址")
    @TableField("head_url")
    private String headUrl;

    @ApiModelProperty(value = "部门id", required = true)
    @TableField("dept_id")
    private Long deptId;

    @ApiModelProperty(value = "岗位id")
    @TableField("post_id")
    private Long postId;

    @ApiModelProperty(value = "描述")
    @TableField("description")
    private String description;

    @ApiModelProperty(value = "openId")
    @TableField("open_id")
    private String openId;

    @ApiModelProperty(value = "状态（1：正常 0：停用）")
    @TableField("status")
    private Integer status;
}

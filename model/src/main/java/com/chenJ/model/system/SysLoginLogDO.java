package com.chenJ.model.system;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.chenJ.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chenJ
 * @Project : chenJ-oa-parent
 * @Package : com.chenJ.model.system
 * @ClassName : SysLoginLog.java
 * @createTime : 2024/4/24 0:28
 * @Description :
 */
@Data
@ApiModel(description = "系统登录日志")
@TableName("sys_login_log")
public class SysLoginLogDO extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户账号")
    @TableField("username")
    private String username;

    @ApiModelProperty(value = "登录IP地址")
    @TableField("ipaddr")
    private String ipaddr;

    @ApiModelProperty(value = "登录状态（0成功 1失败）")
    @TableField("status")
    private Integer status;

    @ApiModelProperty(value = "提示信息")
    @TableField("msg")
    private String msg;

    @ApiModelProperty(value = "访问时间")
    @TableField("access_time")
    private Date accessTime;
}

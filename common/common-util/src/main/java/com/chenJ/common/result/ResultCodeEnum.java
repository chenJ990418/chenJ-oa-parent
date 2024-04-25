package com.chenJ.common.result;

import lombok.Getter;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chenJ
 * @Project : chenJ-oa-parent
 * @Package : com.chenJ.common.result
 * @ClassName : ResultCodeEnum.java
 * @createTime : 2024/4/25 22:38
 * @Description :
 */

/**
 * 统一返回结果状态类
 */
@Getter
public enum ResultCodeEnum {

    SUCCESS(200,"成功"),
    FAIL(201,"失败"),
    SERVICE_ERROR(2012,"服务异常"),
    DATA_ERROR(204,"数据异常"),
    LOGIN_ERROR(208,"未登录"),
    PERMISSION_ERROR(209,"无权限");

    private Integer code;
    private String msg;

    ResultCodeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}

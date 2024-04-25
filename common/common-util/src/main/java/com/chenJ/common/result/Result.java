package com.chenJ.common.result;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chenJ
 * @Project : chenJ-oa-parent
 * @Package : com.chenJ.common.result
 * @ClassName : Result.java
 * @createTime : 2024/4/25 22:43
 * @Description :
 */
@Data
public class Result<T> {

    private Integer code; //状态码
    private String msg; //返回信息
    private T data; //返回数据

    //私有化
    private Result() {
    }

    // 封装返回数据
    public static <T> Result<T> build(T body, ResultCodeEnum resultCodeEnum) {
        Result<T> result = new Result<T>();
        if (body != null) {
            result.setData(body);
        }
        result.setCode(resultCodeEnum.getCode());
        result.setMsg(resultCodeEnum.getMsg());
        return result;
    }

    //success
    public static <T> Result<T> success() {
        return build(null, ResultCodeEnum.SUCCESS);
    }

    public static <T> Result<T> success(T data) {
        return build(data, ResultCodeEnum.SUCCESS);
    }

    // fail
    public static <T> Result<T> fail() {
        return build(null, ResultCodeEnum.FAIL);
    }

    public static <T> Result<T> fail(T data) {
        return build(data, ResultCodeEnum.FAIL);
    }

    public Result<T> msg(String msg) {
        this.setMsg(msg);
        return this;
    }

    public Result<T> code(Integer code) {
        this.setCode(code);
        return this;
    }

}

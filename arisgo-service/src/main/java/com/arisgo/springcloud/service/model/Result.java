package com.arisgo.springcloud.service.model;

import org.springframework.util.ObjectUtils;

/**
 * @version 1.0
 * @auther Silencer
 * @date 2019-01-19 0:03
 */
public class Result {

    private boolean flag;
    private String code;
    private String msg;
    private Object object;

    public static Result success() {
        return success(null);
    }

    public static Result success(Object object) {
        return success("1", "响应成功！", object);
    }

    public static Result success(String code, String msg, Object object) {
        return getInstance(true, code, msg, object);
    }

    public static Result error() {
        return error("响应失败！");
    }

    public static Result error(String msg) {
        return error("0", msg);
    }

    public static Result error(String code, String msg) {
        return error(code, msg, null);
    }

    public static Result error(String code, String msg, Object object) {
        return getInstance(false, code, msg, object);
    }

    private static Result getInstance(boolean flag, String code, String msg, Object object) {
        if (ObjectUtils.isEmpty(object)) {
            object = "{}";
        }
        Result result = new Result();
        result.setFlag(flag);
        result.setCode(code);
        result.setMsg(msg);
        result.setObject(object);
        return result;
    }

    public Result() {
    }

    public Result(boolean flag, String code, String msg, Object object) {
        this.flag = flag;
        this.code = code;
        this.msg = msg;
        this.object = object;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}

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
    private Object data;

    public static Result success() {
        return success(null);
    }

    public static Result success(Object data) {
        return success("1", "请求成功！", data);
    }

    public static Result success(String code, String msg, Object data) {
        return newInstance(true, code, msg, data);
    }

    public static Result error() {
        return error("请求失败！");
    }

    public static Result error(String msg) {
        return error("0", msg);
    }

    public static Result error(String code, String msg) {
        return error(code, msg, null);
    }

    public static Result error(String code, String msg, Object data) {
        return newInstance(false, code, msg, data);
    }

    private static Result newInstance(boolean flag, String code, String msg, Object data) {
        if (ObjectUtils.isEmpty(data)) {
            data = "{}";
        }
        return new Result(flag, code, msg, data);
    }

    public Result() {
    }

    public Result(boolean flag, String code, String msg, Object data) {
        this.flag = flag;
        this.code = code;
        this.msg = msg;
        this.data = data;
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

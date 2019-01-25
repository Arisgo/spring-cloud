package com.arisgo.springcloud.service.enums;

import com.arisgo.springcloud.service.utils.Result;

/**
 * @author Silencer
 * @version 1.0
 * @date 2019-01-22 22:35
 */
public enum SysCodeEnum {

    SYS_SUCCESS(true,"1", "请求成功！"),
    SYS_ERROR(false,"0", "请求失败！"),
    SYS_EXCEPTION(false,"500", "系统异常！");

    // 成功为true，失败为false
    private Boolean flag;
    private String code;
    private String msg;

    SysCodeEnum(Boolean flag, String code, String msg) {
        this.flag = flag;
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public Result converResult() {
        return new Result(flag, code, msg, null);
    }
    public Result converResult(Object data) {
        return new Result(flag, code, msg, data);
    }

}

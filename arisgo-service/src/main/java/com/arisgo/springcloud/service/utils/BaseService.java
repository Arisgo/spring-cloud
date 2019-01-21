package com.arisgo.springcloud.service.utils;

/**
 * @author Silencer
 * @version 1.0
 * @date 2019-01-21 17:23
 */
public class BaseService {

    public Result exception() {
        return Result.error("系统异常！请联系管理员！");
    }
}

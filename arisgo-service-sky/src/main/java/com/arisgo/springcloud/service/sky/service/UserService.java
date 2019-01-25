package com.arisgo.springcloud.service.sky.service;

import com.arisgo.springcloud.service.sky.model.User;
import com.arisgo.springcloud.service.utils.Result;

/**
 * @author Silencer
 * @version 1.0
 * @date 2019-01-20 10:16
 */
public interface UserService {

    Result getUser();

    Result insert(User user);

    Result getRedis(String id);


}

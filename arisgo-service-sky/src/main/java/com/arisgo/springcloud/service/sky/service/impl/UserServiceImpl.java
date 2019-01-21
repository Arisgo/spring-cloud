package com.arisgo.springcloud.service.sky.service.impl;

import com.arisgo.springcloud.service.utils.Result;
import com.arisgo.springcloud.service.sky.mapper.UserMapper;
import com.arisgo.springcloud.service.sky.model.User;
import com.arisgo.springcloud.service.sky.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @version 1.0
 * @author Silencer
 * @date 2019-01-20 10:19
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public Result getUser() {
        List<User> list = userMapper.getUser();
        return Result.success(list);
    }
}

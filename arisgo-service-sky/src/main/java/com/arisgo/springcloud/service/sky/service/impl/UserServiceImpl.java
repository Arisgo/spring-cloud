package com.arisgo.springcloud.service.sky.service.impl;

import com.arisgo.springcloud.service.base.BaseService;
import com.arisgo.springcloud.service.sky.mapper.UserMapper;
import com.arisgo.springcloud.service.sky.model.User;
import com.arisgo.springcloud.service.sky.service.UserService;
import com.arisgo.springcloud.service.utils.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Silencer
 * @version 1.0
 * @date 2019-01-20 10:19
 */
@Service
public class UserServiceImpl extends BaseService implements UserService {

    private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Resource
    private UserMapper userMapper;

    @Override
//    @HystrixCommand(fallbackMethod = "exception")
    public Result getUser() {
        List<User> list = userMapper.getList(null);
        return Result.success(list);
    }

    @CacheEvict(cacheNames = "redis", allEntries = true)
    @Override
    public Result insert(User user) {
        userMapper.insert(user);
        logger.info("......... {} .........", user);
        return Result.success(user);
    }

    @Override
    @Cacheable(cacheNames = "redis")
    public Result getRedis(String id) {
        logger.info("......... {} .........", "开始查询！");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        User user = userMapper.getEntityById(id);
        logger.info("......... {} .........", user);
        logger.info("......... {} .........", "查询结束！");
        return Result.success(user);
    }


}

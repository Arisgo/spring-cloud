package com.arisgo.springcloud.service.sky.dao;

import com.arisgo.springcloud.service.sky.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @version 1.0
 * @auther Silencer
 * @date 2019-01-20 10:10
 */
@Mapper
public interface UserMapper {

    List<User> getUser();
}

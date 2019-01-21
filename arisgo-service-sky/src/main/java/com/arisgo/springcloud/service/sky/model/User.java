package com.arisgo.springcloud.service.sky.model;

import com.arisgo.springcloud.service.model.BaseEntity;

/**
 * @version 1.0
 * @auther Silencer
 * @date 2019-01-20 10:11
 */
public class User extends BaseEntity {

    private Integer userId;
    private String userName;
    private String password;
    private String realName;
    private String nickName;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

}

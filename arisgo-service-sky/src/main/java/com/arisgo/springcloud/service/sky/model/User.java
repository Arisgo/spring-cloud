package com.arisgo.springcloud.service.sky.model;

import com.arisgo.springcloud.service.base.BaseEntity;

/**
 * @version 1.0
 * @author Silencer
 * @date 2019-01-20 10:11
 */
public class User extends BaseEntity {

    private static final long serialVersionUID = 5746509939062256448L;

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

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", realName='" + realName + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}

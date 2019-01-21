package com.arisgo.springcloud.service.user.model;

import com.arisgo.springcloud.service.model.BaseEntity;

/**
 * @author Silencer
 * @version 1.0
 * @date 2019-01-21 14:37
 */
public class Role extends BaseEntity {
    private static final long serialVersionUID = -3393742965247674100L;

    private Integer roleId;
    private String roleName;
    private String remark;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}

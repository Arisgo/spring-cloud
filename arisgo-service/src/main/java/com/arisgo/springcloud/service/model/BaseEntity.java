package com.arisgo.springcloud.service.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Silencer
 * @version 1.0
 * @date 2019-01-21 10:27
 */
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 5501958871667110457L;

    private String status;
    private String createBy;
    private Date createDt;
    private String updateBy;
    private Date updateDt;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDt() {
        return createDt;
    }

    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateDt() {
        return updateDt;
    }

    public void setUpdateDt(Date updateDt) {
        this.updateDt = updateDt;
    }
}

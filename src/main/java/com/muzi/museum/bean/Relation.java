package com.muzi.museum.bean;

import java.util.Date;

public class Relation {
    private Integer id;

    private Integer relTel;

    private String relEmail;

    private String relWeixin;

    private String relWeibo;

    private Date createTime;

    private Date updateTime;

    private String createUser;

    private String updateUser;

    private String isDelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRelTel() {
        return relTel;
    }

    public void setRelTel(Integer relTel) {
        this.relTel = relTel;
    }

    public String getRelEmail() {
        return relEmail;
    }

    public void setRelEmail(String relEmail) {
        this.relEmail = relEmail == null ? null : relEmail.trim();
    }

    public String getRelWeixin() {
        return relWeixin;
    }

    public void setRelWeixin(String relWeixin) {
        this.relWeixin = relWeixin == null ? null : relWeixin.trim();
    }

    public String getRelWeibo() {
        return relWeibo;
    }

    public void setRelWeibo(String relWeibo) {
        this.relWeibo = relWeibo == null ? null : relWeibo.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete == null ? null : isDelete.trim();
    }
}
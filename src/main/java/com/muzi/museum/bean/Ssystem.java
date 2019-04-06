package com.muzi.museum.bean;

import java.util.Date;

public class Ssystem {
    private Integer id;

    private String sVison;

    private String sName;

    private String sCopyright;

    private String sCode;

    private Date sDate;

    private String sAdminLogin;

    private Integer sTel;

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

    public String getsVison() {
        return sVison;
    }

    public void setsVison(String sVison) {
        this.sVison = sVison == null ? null : sVison.trim();
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    public String getsCopyright() {
        return sCopyright;
    }

    public void setsCopyright(String sCopyright) {
        this.sCopyright = sCopyright == null ? null : sCopyright.trim();
    }

    public String getsCode() {
        return sCode;
    }

    public void setsCode(String sCode) {
        this.sCode = sCode == null ? null : sCode.trim();
    }

    public Date getsDate() {
        return sDate;
    }

    public void setsDate(Date sDate) {
        this.sDate = sDate;
    }

    public String getsAdminLogin() {
        return sAdminLogin;
    }

    public void setsAdminLogin(String sAdminLogin) {
        this.sAdminLogin = sAdminLogin == null ? null : sAdminLogin.trim();
    }

    public Integer getsTel() {
        return sTel;
    }

    public void setsTel(Integer sTel) {
        this.sTel = sTel;
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
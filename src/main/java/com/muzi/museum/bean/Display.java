package com.muzi.museum.bean;

import java.util.Date;

public class Display {
    private Integer id;

    private String displayTitle;

    private Integer typeId;

    private Integer cultureId;

    private Date diapalyStartdate;

    private Date displayEnddate;

    private Date createTime;

    private Date updateTime;

    private String createUser;

    private String updateUser;

    private String isDelete;

    private String displayContend;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDisplayTitle() {
        return displayTitle;
    }

    public void setDisplayTitle(String displayTitle) {
        this.displayTitle = displayTitle == null ? null : displayTitle.trim();
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getCultureId() {
        return cultureId;
    }

    public void setCultureId(Integer cultureId) {
        this.cultureId = cultureId;
    }

    public Date getDiapalyStartdate() {
        return diapalyStartdate;
    }

    public void setDiapalyStartdate(Date diapalyStartdate) {
        this.diapalyStartdate = diapalyStartdate;
    }

    public Date getDisplayEnddate() {
        return displayEnddate;
    }

    public void setDisplayEnddate(Date displayEnddate) {
        this.displayEnddate = displayEnddate;
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

    public String getDisplayContend() {
        return displayContend;
    }

    public void setDisplayContend(String displayContend) {
        this.displayContend = displayContend == null ? null : displayContend.trim();
    }
}
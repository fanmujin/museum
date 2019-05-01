package com.muzi.museum.bean.extend;

import com.muzi.museum.bean.Display_picture;

import java.util.Date;
import java.util.List;

public class DisplayVM {
    private Integer id;

    private String displayTitle;

    private Date diapalyStartdate;

    private Date displayEnddate;

    private Date createTime;

    private Date updateTime;

    private String createUser;

    private String updateUser;

    private String isDelete;

    private String displayContend;

    private List<Display_picture> display_pictures;

    public List<Display_picture> getDisplay_pictures() {
        return display_pictures;
    }

    public void setDisplay_pictures(List<Display_picture> display_pictures) {
        this.display_pictures = display_pictures;
    }

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
        this.displayTitle = displayTitle;
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
        this.createUser = createUser;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    public String getDisplayContend() {
        return displayContend;
    }

    public void setDisplayContend(String displayContend) {
        this.displayContend = displayContend;
    }

}

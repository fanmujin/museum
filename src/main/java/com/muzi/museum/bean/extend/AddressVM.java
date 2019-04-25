package com.muzi.museum.bean.extend;

import com.muzi.museum.bean.Culture;

import java.util.Date;
import java.util.List;

public class AddressVM {

    private Integer id;

    private String addressName;

    private String addressPicture;

    private Date createTime;

    private Date updateTime;

    private String createUser;

    private String updateUser;

    private String isDelete;

    private List<Culture> cultureList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public String getAddressPicture() {
        return addressPicture;
    }

    public void setAddressPicture(String addressPicture) {
        this.addressPicture = addressPicture;
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

    public List<Culture> getCultureList() {
        return cultureList;
    }

    public void setCultureList(List<Culture> cultureList) {
        this.cultureList = cultureList;
    }

}

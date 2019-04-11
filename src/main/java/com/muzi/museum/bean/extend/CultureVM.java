package com.muzi.museum.bean.extend;

import com.muzi.museum.bean.*;

import java.util.Date;
import java.util.List;

public class CultureVM {
    private Integer id;

    private String cultureName;

    private Integer typeId;

    private Integer addressId;

    private String cultureDescription;

    private String cultureLevel;

    private String culturePicture;

    private Date createTime;

    private Date updateTime;

    private String createUser;

    private String updateUser;

    private String isDelete;

    private Address address;

    private Typee typee;

    private List<Culture_picture> culture_pictures;

    private List<CultureDigital> cultureDigitals;

    private List<CultureDisplay> cultureDisplays;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCultureName() {
        return cultureName;
    }

    public void setCultureName(String cultureName) {
        this.cultureName = cultureName;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getCultureDescription() {
        return cultureDescription;
    }

    public void setCultureDescription(String cultureDescription) {
        this.cultureDescription = cultureDescription;
    }

    public String getCultureLevel() {
        return cultureLevel;
    }

    public void setCultureLevel(String cultureLevel) {
        this.cultureLevel = cultureLevel;
    }

    public String getCulturePicture() {
        return culturePicture;
    }

    public void setCulturePicture(String culturePicture) {
        this.culturePicture = culturePicture;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Typee getTypee() {
        return typee;
    }

    public void setTypee(Typee typee) {
        this.typee = typee;
    }

    public List<Culture_picture> getCulture_pictures() {
        return culture_pictures;
    }

    public void setCulture_pictures(List<Culture_picture> culture_pictures) {
        this.culture_pictures = culture_pictures;
    }

    public List<CultureDigital> getCultureDigitals() {
        return cultureDigitals;
    }

    public void setCultureDigitals(List<CultureDigital> cultureDigitals) {
        this.cultureDigitals = cultureDigitals;
    }

    public List<CultureDisplay> getCultureDisplays() {
        return cultureDisplays;
    }

    public void setCultureDisplays(List<CultureDisplay> cultureDisplays) {
        this.cultureDisplays = cultureDisplays;
    }
}

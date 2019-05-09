package com.muzi.museum.service;

import com.muzi.museum.bean.Address;
import com.muzi.museum.bean.extend.AddressVM;

import java.util.List;


public interface IAddressService {
    public AddressVM findAddressById(int id);
    //通过名字模糊查询
    public List<Address> findByName(String name);
    //根据id删除地理位置
    public int deleteById(int id);
    //添加新的地理
    public int addAddress(Address address);
    //修改地理信息
    public int updateAddress(Address address);
}

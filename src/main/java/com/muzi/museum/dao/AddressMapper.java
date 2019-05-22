package com.muzi.museum.dao;

import com.muzi.museum.bean.Address;

import java.util.List;

public interface AddressMapper {
    //通过ID删除收录地址记录
    int deleteByPrimaryKey(Integer id);
    //插入新的收录地址记录
    int insert(Address record);
    //有选择的添加字段记录
    int insertSelective(Address record);
    //通过id查找记录
    Address selectByPrimaryKey(Integer id);
    //通过主键ID，选择性修改记录
    int updateByPrimaryKeySelective(Address record);
    //通过主键ID修改记录
    int updateByPrimaryKey(Address record);
    //通过Name模糊查询记录
    List<Address> selectByPrimaryWord(String name);


}
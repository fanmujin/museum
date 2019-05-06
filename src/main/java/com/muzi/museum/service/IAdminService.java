package com.muzi.museum.service;

import com.muzi.museum.bean.Admin;

import java.util.List;

public interface IAdminService {
    //查找所有的管理员的详细信息
    public List<Admin> findAll();
    //添加管理员
    public int insert(Admin admin);
    //通过id删除管理员的详细信息
    public int deleteByPrimaryKey(int id);
    //通过id查询管理员的详细信息
    public Admin selectByPrimaryKey(int id);
    //通过管理员的id更新管理员的详细信息
    public int updateByPrimaryKey(Admin admin);
    //通过管理员的名字查询管理员的详细信息
    public List<Admin> findByName(String name);



}

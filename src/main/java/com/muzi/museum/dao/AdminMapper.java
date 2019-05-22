package com.muzi.museum.dao;

import com.muzi.museum.bean.Admin;

import java.util.List;

public interface AdminMapper {
    //通过id删除管理员的详细信息
    int deleteByPrimaryKey(int id);
    //管理员的添加
    int insert(Admin record);
    //插入管理员记录信息
    int insertSelective(Admin record);
    //通过id查询管理员的详细信息
    Admin selectByPrimaryKey(int id);
    //通过主键，选择性修改管理员信息
    int updateByPrimaryKeySelective(Admin record);
    //通过id进行管理员的详细信息的更新
    int updateByPrimaryKey(Admin record);
    //管理员登录
    int login (String name ,String password);
    //查找所有的管理员的详细信息
    List<Admin> selectAll();
    //查找管理员信息通过关键字
    List<Admin> selectByName(String name);
    //通过管理员的名字查找管理员的信息
    Admin selectAdmin(String name);
}
package com.muzi.museum.dao;

import com.muzi.museum.bean.Admin;

import java.util.List;

public interface AdminMapper {
    //通过id删除管理员的详细信息
    int deleteByPrimaryKey(int id);
    //管理员的添加
    int insert(Admin record);

    int insertSelective(Admin record);
    //通过id查询管理员的详细信息
    Admin selectByPrimaryKey(int id);

    int updateByPrimaryKeySelective(Admin record);
    //通过id进行管理员的详细信息的更新
    int updateByPrimaryKey(Admin record);

    int login (String name ,String password);
    //查找所有的管理员的详细信息
    List<Admin> selectAll();
    //查找管理员信息通过关键字
    List<Admin> selectByName(String name);
}
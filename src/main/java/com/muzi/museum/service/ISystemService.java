package com.muzi.museum.service;

import com.muzi.museum.bean.Ssystem;

import java.util.List;

public interface ISystemService {
    //查询所有的系统配置
    public List<Ssystem> findAll();
    //通过id查询系统配置
    public Ssystem findSystemById(int id);
    //添加新的系统配置
    public int insertSystem(Ssystem ssystem);
    //修改系统配置
    public int updateSystem(Ssystem ssystem);
    //删除系统配置
    public int deleteSystem(int id);
}

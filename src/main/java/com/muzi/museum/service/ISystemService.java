package com.muzi.museum.service;

import com.muzi.museum.bean.Ssy;
import java.util.List;

public interface ISystemService {
    //查询所有的系统配置
    public List<Ssy> findAll();
    //通过id查询系统配置
    public Ssy findSystemById(int id);
    //添加新的系统配置
    public int insertSystem(Ssy ssy);
    //修改系统配置
    public int updateSystem(Ssy ssy);
    //删除系统配置
    public int deleteSystem(int id);
}

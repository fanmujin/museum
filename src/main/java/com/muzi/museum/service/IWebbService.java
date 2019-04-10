package com.muzi.museum.service;

import com.muzi.museum.bean.Webb;

import java.util.List;

public interface IWebbService {
    //查询所有的相关网站
    public List<Webb> findAll();
    //通过id查询相关网站
    public Webb findWebById(int id);
    //添加相关网站
    public int insertWeb(Webb webb);
    //修改相关网站
    public int updateWebById(Webb webb);
    //删除相关网站
    public int deletWebById(int id);
}

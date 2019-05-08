package com.muzi.museum.service;

import com.muzi.museum.bean.Digital;

import java.util.List;

public interface IDigitalService {
    //模糊查询网上展厅信息
    public List<Digital> findDigitalByPrimaryWord(String name);
    //修改网上展厅信息
    public int updateByPrimaryKey(Digital digital);
    //删除晚上展厅信息
    public int deleteByPrimaryKey(int id);
}

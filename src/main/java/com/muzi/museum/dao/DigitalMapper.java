package com.muzi.museum.dao;

import com.muzi.museum.bean.Digital;

import java.util.List;

public interface DigitalMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Digital record);

    int insertSelective(Digital record);

    Digital selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Digital record);

    int updateByPrimaryKey(Digital record);

    //根据名字模糊查询所有的展厅
    List<Digital> selectByPrimaryWord(String name);
}
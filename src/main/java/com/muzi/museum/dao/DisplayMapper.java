package com.muzi.museum.dao;

import com.muzi.museum.bean.Display;

import java.util.List;

public interface DisplayMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Display record);

    int insertSelective(Display record);

    Display selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Display record);

    int updateByPrimaryKeyWithBLOBs(Display record);

    int updateByPrimaryKey(Display record);

    List<Display> selectDisplay();
}
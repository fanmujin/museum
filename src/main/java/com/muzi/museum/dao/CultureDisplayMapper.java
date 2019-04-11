package com.muzi.museum.dao;

import com.muzi.museum.bean.CultureDisplay;

public interface CultureDisplayMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CultureDisplay record);

    int insertSelective(CultureDisplay record);

    CultureDisplay selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CultureDisplay record);

    int updateByPrimaryKey(CultureDisplay record);
}
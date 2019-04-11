package com.muzi.museum.dao;

import com.muzi.museum.bean.TypeDisplay;

public interface TypeDisplayMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TypeDisplay record);

    int insertSelective(TypeDisplay record);

    TypeDisplay selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TypeDisplay record);

    int updateByPrimaryKey(TypeDisplay record);
}
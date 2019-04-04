package com.muzi.museum.dao;

import com.muzi.museum.bean.Active;

import java.util.List;

public interface ActiveMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Active record);

    int insertSelective(Active record);

    Active selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Active record);

    int updateByPrimaryKey(Active record);

    List<Active> findAll();
 }
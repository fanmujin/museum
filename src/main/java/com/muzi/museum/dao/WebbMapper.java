package com.muzi.museum.dao;

import com.muzi.museum.bean.Webb;

public interface WebbMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Webb record);

    int insertSelective(Webb record);

    Webb selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Webb record);

    int updateByPrimaryKey(Webb record);
}
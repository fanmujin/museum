package com.muzi.museum.dao;

import com.muzi.museum.bean.Digital;

public interface DigitalMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Digital record);

    int insertSelective(Digital record);

    Digital selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Digital record);

    int updateByPrimaryKey(Digital record);
}
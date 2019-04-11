package com.muzi.museum.dao;

import com.muzi.museum.bean.TypeDigital;

public interface TypeDigitalMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TypeDigital record);

    int insertSelective(TypeDigital record);

    TypeDigital selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TypeDigital record);

    int updateByPrimaryKey(TypeDigital record);
}
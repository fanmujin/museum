package com.muzi.museum.dao;

import com.muzi.museum.bean.Typee;

public interface TypeeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Typee record);

    int insertSelective(Typee record);

    Typee selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Typee record);

    int updateByPrimaryKeyWithBLOBs(Typee record);

    int updateByPrimaryKey(Typee record);
}
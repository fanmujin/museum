package com.muzi.museum.dao;

import com.muzi.museum.bean.Institution;

public interface InstitutionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Institution record);

    int insertSelective(Institution record);

    Institution selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Institution record);

    int updateByPrimaryKeyWithBLOBs(Institution record);

    int updateByPrimaryKey(Institution record);
}
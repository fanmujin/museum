package com.muzi.museum.dao;

import com.muzi.museum.bean.DDoc;

public interface DDocMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DDoc record);

    int insertSelective(DDoc record);

    DDoc selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DDoc record);

    int updateByPrimaryKey(DDoc record);
}
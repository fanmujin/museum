package com.muzi.museum.dao;

import com.muzi.museum.bean.Ssystem;

public interface SsystemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Ssystem record);

    int insertSelective(Ssystem record);

    Ssystem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Ssystem record);

    int updateByPrimaryKey(Ssystem record);
}
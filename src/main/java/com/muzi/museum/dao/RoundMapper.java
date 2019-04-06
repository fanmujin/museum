package com.muzi.museum.dao;

import com.muzi.museum.bean.Round;

public interface RoundMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Round record);

    int insertSelective(Round record);

    Round selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Round record);

    int updateByPrimaryKey(Round record);
}
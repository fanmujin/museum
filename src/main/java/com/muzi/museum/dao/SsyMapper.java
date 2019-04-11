package com.muzi.museum.dao;

import com.muzi.museum.bean.Ssy;

import java.util.List;

public interface SsyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Ssy record);

    int insertSelective(Ssy record);

    Ssy selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Ssy record);

    int updateByPrimaryKey(Ssy record);

    List<Ssy> selectAll();
}
package com.muzi.museum.dao;

import com.muzi.museum.bean.Institutions;

import java.util.List;

public interface InstitutionsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Institutions record);

    int insertSelective(Institutions record);

    Institutions selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Institutions record);

    int updateByPrimaryKeyWithBLOBs(Institutions record);

    int updateByPrimaryKey(Institutions record);

    List<Institutions> selectAll();
    //通过name模糊查询
    List<Institutions> selectByPrimaryWord(String name);
}
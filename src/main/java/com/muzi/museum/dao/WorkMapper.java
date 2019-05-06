package com.muzi.museum.dao;

import com.muzi.museum.bean.Work;

import java.util.List;

public interface WorkMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Work record);

    int insertSelective(Work record);

    Work selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Work record);

    int updateByPrimaryKeyWithBLOBs(Work record);

    int updateByPrimaryKey(Work record);

    List<Work> selectAllWork();
}
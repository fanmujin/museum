package com.muzi.museum.dao;

import com.muzi.museum.bean.Round_picture;

import java.util.List;

public interface Round_pictureMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Round_picture record);

    int insertSelective(Round_picture record);

    Round_picture selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Round_picture record);

    int updateByPrimaryKey(Round_picture record);

    List<Round_picture> selectAll();
}
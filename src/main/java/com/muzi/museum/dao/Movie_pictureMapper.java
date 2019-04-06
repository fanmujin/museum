package com.muzi.museum.dao;

import com.muzi.museum.bean.Movie_picture;

public interface Movie_pictureMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Movie_picture record);

    int insertSelective(Movie_picture record);

    Movie_picture selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Movie_picture record);

    int updateByPrimaryKey(Movie_picture record);
}
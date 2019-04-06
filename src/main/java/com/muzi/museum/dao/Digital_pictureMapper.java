package com.muzi.museum.dao;

import com.muzi.museum.bean.Digital_picture;

public interface Digital_pictureMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Digital_picture record);

    int insertSelective(Digital_picture record);

    Digital_picture selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Digital_picture record);

    int updateByPrimaryKey(Digital_picture record);
}
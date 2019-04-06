package com.muzi.museum.dao;

import com.muzi.museum.bean.Display_picture;

public interface Display_pictureMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Display_picture record);

    int insertSelective(Display_picture record);

    Display_picture selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Display_picture record);

    int updateByPrimaryKey(Display_picture record);
}
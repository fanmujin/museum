package com.muzi.museum.dao;

import com.muzi.museum.bean.Type_picture;

public interface Type_pictureMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Type_picture record);

    int insertSelective(Type_picture record);

    Type_picture selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Type_picture record);

    int updateByPrimaryKey(Type_picture record);

    int deleteByType_id (Integer id);


}
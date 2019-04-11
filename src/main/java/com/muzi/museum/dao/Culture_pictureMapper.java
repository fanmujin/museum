package com.muzi.museum.dao;

import com.muzi.museum.bean.Culture_picture;

import java.util.List;

public interface Culture_pictureMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Culture_picture record);

    int insertSelective(Culture_picture record);

    Culture_picture selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Culture_picture record);

    int updateByPrimaryKey(Culture_picture record);

    List<Culture_picture> selectByCultureByCultureId();
}
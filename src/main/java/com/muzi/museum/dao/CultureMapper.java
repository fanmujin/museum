package com.muzi.museum.dao;

import com.muzi.museum.bean.Culture;

public interface CultureMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Culture record);

    int insertSelective(Culture record);

    Culture selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Culture record);

    int updateByPrimaryKey(Culture record);
}
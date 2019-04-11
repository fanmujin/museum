package com.muzi.museum.dao;

import com.muzi.museum.bean.CultureDigital;

import java.util.List;

public interface CultureDigitalMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CultureDigital record);

    int insertSelective(CultureDigital record);

    CultureDigital selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CultureDigital record);

    int updateByPrimaryKey(CultureDigital record);

    List<CultureDigital> selectDigitalByCultureId();
}
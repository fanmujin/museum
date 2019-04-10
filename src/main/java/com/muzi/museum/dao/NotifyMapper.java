package com.muzi.museum.dao;

import com.muzi.museum.bean.Notify;
import java.util.List;

public interface NotifyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Notify record);

    int insertSelective(Notify record);

    Notify selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Notify record);

    int updateByPrimaryKeyWithBLOBs(Notify record);

    int updateByPrimaryKey(Notify record);

    List<Notify> selectAll();
}
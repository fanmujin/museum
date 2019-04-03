package com.muzi.museum.dao;

import com.muzi.museum.bean.DDoc;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DDocMapper {

    List<DDoc> findAll();

    DDoc selectByPrimaryKey(int id);

    int insert(DDoc dDoc);

    int deleteByPrimaryKey(int id);

    int updateByPrimaryKey(DDoc dDoc);

}
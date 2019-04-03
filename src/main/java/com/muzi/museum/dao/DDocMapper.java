package com.muzi.museum.dao;

import com.muzi.museum.bean.DDoc;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DDocMapper {

    List<DDoc> findAll();
    int insert(DDoc dDoc);
}
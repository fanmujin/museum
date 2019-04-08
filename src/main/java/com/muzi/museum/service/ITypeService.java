package com.muzi.museum.service;

import com.muzi.museum.bean.Type_picture;
import com.muzi.museum.bean.extend.TypeeVM;

import java.util.List;

public interface ITypeService {
    //查询所有的名俗类别
    public List<TypeeVM> findAll();
}

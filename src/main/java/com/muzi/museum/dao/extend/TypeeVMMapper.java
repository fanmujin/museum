package com.muzi.museum.dao.extend;

import com.muzi.museum.bean.Type_picture;
import com.muzi.museum.bean.extend.TypeeVM;

import java.util.List;

public interface TypeeVMMapper {
    //查询所有的名俗类别
    List<TypeeVM> selectAll();
}

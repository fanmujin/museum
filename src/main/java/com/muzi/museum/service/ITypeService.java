package com.muzi.museum.service;

import com.muzi.museum.bean.Typee;
import com.muzi.museum.bean.extend.TypeeVM;

import java.util.List;

public interface ITypeService {
    //查询所有的名俗类别
    public List<TypeeVM> findAll();
    //保存名俗类别
    public int insert(Typee typee);
    //保存所有的名俗以及图片
    public void saveOrupdateTypeeVM(TypeeVM typeeVM);
}

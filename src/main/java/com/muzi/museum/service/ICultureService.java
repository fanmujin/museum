package com.muzi.museum.service;

import com.muzi.museum.bean.Culture;
import com.muzi.museum.bean.extend.CultureVM;

import java.util.List;

public interface ICultureService {
    //查询所有的名俗信息(详细信息，图片，地址，类别，参展信息，展厅位置)
    public List<CultureVM> findAllCulture();
    //查询名俗的详细信息
    public List<Culture> findCulture();
}

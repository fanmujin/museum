package com.muzi.museum.dao.extend;

import com.muzi.museum.bean.extend.CultureVM;

import java.util.List;

public interface CultureVMMapper {
    //查询所有的名俗的信息
    List<CultureVM> seleteAll();
    //通过名字模糊查询名俗信息
    List<CultureVM> seleteAllByName(String name);
}

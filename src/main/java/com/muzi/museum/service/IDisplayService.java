package com.muzi.museum.service;

import com.muzi.museum.bean.Display;

import java.util.List;

public interface IDisplayService {
    //查询所有的展览信息
    public List<Display> findAllDisplay();
    //通过id查询展览信息
    public Display findDisplayById(int id);
}

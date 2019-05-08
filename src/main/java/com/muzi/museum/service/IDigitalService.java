package com.muzi.museum.service;

import com.muzi.museum.bean.Digital;

import java.util.List;

public interface IDigitalService {
    //模糊查询网上展厅信息
    public List<Digital> findDigitalByPrimaryWord(String name);
}

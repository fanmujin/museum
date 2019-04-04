package com.muzi.museum.service;

import com.muzi.museum.bean.Active;

import java.util.List;

public interface ActiveService {
    public List<Active> findAll();

    public Active seleteByPrimaryKey(int id);

    public int insert(Active active);

    public int deleteByPrimaryKey(int id);

    public int updateByPrimaryKey(Active active);
}

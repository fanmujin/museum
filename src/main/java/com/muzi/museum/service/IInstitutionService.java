package com.muzi.museum.service;

import com.muzi.museum.bean.Institution;
import com.muzi.museum.bean.Institutions;

import java.util.List;

public interface IInstitutionService {
    //查询所有的学术文章
    public List<Institutions> findAll();
    //通过id查询学术文章
    public Institutions findInstitutionById(int id);
    //插入新的学术文章
    public int insert(Institutions institution);
    //修改学术文章
    public int updateById(Institutions institution);
    //删除学术文章
    public int deleteById(int id);
}

package com.muzi.museum.service;

import com.muzi.museum.bean.Institutions;
import java.util.List;

public interface IInstitutionService {
    //查询所有的学术文章
    public List<Institutions> findAll();
    //通过id查询学术文章
    public Institutions findInstitutionById(int id);
    //插入新的学术文章
    public int insert(Institutions institutions);
    //修改学术文章
    public int updateById(Institutions institutions);
    //删除学术文章
    public int deleteById(int id);
    //通过name模糊查询学术报告
    public List<Institutions> findByName(String name);
}

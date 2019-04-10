package com.muzi.museum.service;

import com.muzi.museum.bean.Relation;
import java.util.List;

public interface IRelationService {

    //查询所有的联系信息
    public List<Relation> findAll();
    //通过id查询联系信息
    public Relation findRelationById(int id);
    //增加新的联系信息
    public int insert(Relation relation);
    //修改联系信息
    public  int updateRelation(Relation relation);
    //通过id删除联系信息
    public  int deleteRelationById(int id);
}

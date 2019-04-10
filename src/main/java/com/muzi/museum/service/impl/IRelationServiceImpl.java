package com.muzi.museum.service.impl;

import com.muzi.museum.bean.Relation;
import com.muzi.museum.dao.RelationMapper;
import com.muzi.museum.service.IRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IRelationServiceImpl implements IRelationService {
    @Autowired
    RelationMapper relationMapper;

    @Override
    public List<Relation> findAll() {
        return relationMapper.selectAll();
    }

    @Override
    public Relation findRelationById(int id) {
        return relationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insert(Relation relation) {
        return relationMapper.insert(relation);
    }

    @Override
    public int updateRelation(Relation relation) {
        return relationMapper.updateByPrimaryKey(relation);
    }

    @Override
    public int deleteRelationById(int id) {
        return relationMapper.deleteByPrimaryKey(id);
    }
}


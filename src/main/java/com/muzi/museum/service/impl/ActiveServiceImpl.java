package com.muzi.museum.service.impl;

import com.muzi.museum.bean.Active;
import com.muzi.museum.dao.ActiveMapper;
import com.muzi.museum.service.ActiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActiveServiceImpl implements ActiveService {
    @Autowired
    ActiveMapper activeMapper;
    @Override
    public List<Active> findAll() {
        return activeMapper.findAll();
    }

    @Override
    public Active seleteByPrimaryKey(int id) {
        return activeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insert(Active active) {
        return activeMapper.insert(active);
    }

    @Override
    public int deleteByPrimaryKey(int id) {
        return activeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKey(Active active) {
        return activeMapper.updateByPrimaryKey(active);
    }
}

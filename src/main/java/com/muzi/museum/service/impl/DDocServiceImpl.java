package com.muzi.museum.service.impl;

import com.muzi.museum.bean.DDoc;
import com.muzi.museum.dao.DDocMapper;
import com.muzi.museum.service.DDocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DDocServiceImpl implements DDocService {
    @Autowired DDocMapper dDocMapper;

    @Override
    public List<DDoc> findAll() {
        return dDocMapper.findAll();
    }

    @Override
    public int insert(DDoc dDoc) {
        return dDocMapper.insert(dDoc);
    }

    @Override
    public DDoc selectByPrimaryKey(int id) {
        return dDocMapper.selectByPrimaryKey(id);
    }

    @Override
    public int deleteByPrimaryKey(int id) {
        return dDocMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKey(DDoc dDoc) {
        return dDocMapper.updateByPrimaryKey(dDoc);
    }
}

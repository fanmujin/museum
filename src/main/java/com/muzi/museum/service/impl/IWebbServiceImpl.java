package com.muzi.museum.service.impl;

import com.muzi.museum.bean.Webb;
import com.muzi.museum.dao.WebbMapper;
import com.muzi.museum.service.IWebbService;
import com.muzi.museum.utils.CurrentTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IWebbServiceImpl implements IWebbService {
    @Autowired
    WebbMapper webbMapper;

    @Override
    public List<Webb> findAll() {
        return webbMapper.selectAll();
    }

    @Override
    public Webb findWebById(int id) {
        return webbMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insertWeb(Webb webb) {
        CurrentTime currentTime = new CurrentTime();
        webb.setCreateTime(currentTime.getTime());
        return webbMapper.insert(webb);
    }

    @Override
    public int updateWebById(Webb webb) {
        CurrentTime currentTime = new CurrentTime();
        webb.setUpdateTime(currentTime.getTime());
        return webbMapper.updateByPrimaryKey(webb);
    }

    @Override
    public int deletWebById(int id) {
        return webbMapper.deleteByPrimaryKey(id);
    }
}

package com.muzi.museum.service.impl;

import com.muzi.museum.bean.Display;
import com.muzi.museum.dao.DisplayMapper;
import com.muzi.museum.service.IDisplayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IDisplayServiceImpl implements IDisplayService {
    @Autowired
    DisplayMapper displayMapper;
    @Override
    public List<Display> findAllDisplay() {
        return displayMapper.selectDisplay();
    }

    @Override
    public Display findDisplayById(int id) {
        return displayMapper.selectByPrimaryKey(id);
    }
}

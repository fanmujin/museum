package com.muzi.museum.service.impl;

import com.muzi.museum.bean.Digital;
import com.muzi.museum.dao.DigitalMapper;
import com.muzi.museum.service.IDigitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IDigitalServiceImpl implements IDigitalService {
    @Autowired
    DigitalMapper digitalMapper;
    @Override
    public List<Digital> findDigitalByPrimaryWord(String name) {
        return digitalMapper.selectByPrimaryWord(name);
    }
}

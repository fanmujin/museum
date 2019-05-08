package com.muzi.museum.service.impl;

import com.muzi.museum.bean.Digital;
import com.muzi.museum.dao.DigitalMapper;
import com.muzi.museum.service.IDigitalService;
import com.muzi.museum.utils.CurrentTime;
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

    @Override
    public int updateByPrimaryKey(Digital digital) {
        CurrentTime currentTime = new CurrentTime();
        digital.setUpdateTime(currentTime.getTime());
        return digitalMapper.updateByPrimaryKey(digital);
    }

    @Override
    public int deleteByPrimaryKey(int id) {
        return digitalMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int addDigital(Digital digital) {
        CurrentTime currentTime = new CurrentTime();
        digital.setCreateTime(currentTime.getTime());
        return digitalMapper.insert(digital);
    }

}

package com.muzi.museum.service.impl;

import com.muzi.museum.bean.Ssy;
import com.muzi.museum.dao.SsyMapper;
import com.muzi.museum.service.ISystemService;
import com.muzi.museum.utils.CurrentTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ISystemServiceImpl implements ISystemService {
    @Autowired
    SsyMapper ssyMapper;

    @Override
    public List<Ssy> findAll() {
        return ssyMapper.selectAll();
    }

    @Override
    public Ssy findSystemById(int id) {
        return ssyMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insertSystem(Ssy ssy) {
        CurrentTime currentTime = new CurrentTime();
        ssy.setCreateTime(currentTime.getTime());
        return ssyMapper.insert(ssy);
    }

    @Override
    public int updateSystem(Ssy ssy) {
        CurrentTime currentTime = new CurrentTime();
        ssy.setUpdateTime(currentTime.getTime());
        return ssyMapper.updateByPrimaryKey(ssy);
    }

    @Override
    public int deleteSystem(int id) {
        return ssyMapper.deleteByPrimaryKey(id);
    }
}

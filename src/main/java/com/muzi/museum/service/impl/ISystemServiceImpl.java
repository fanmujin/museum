package com.muzi.museum.service.impl;

import com.muzi.museum.bean.Ssystem;
import com.muzi.museum.dao.SsystemMapper;
import com.muzi.museum.service.ISystemService;
import com.muzi.museum.utils.CurrentTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ISystemServiceImpl implements ISystemService {
    @Autowired
    SsystemMapper ssystemMapper;

    @Override
    public List<Ssystem> findAll() {
        return ssystemMapper.selectAll();
    }

    @Override
    public Ssystem findSystemById(int id) {
        return ssystemMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insertSystem(Ssystem ssystem) {
        CurrentTime currentTime = new CurrentTime();
        ssystem.setCreateTime(currentTime.getTime());
        return ssystemMapper.insert(ssystem);
    }

    @Override
    public int updateSystem(Ssystem ssystem) {
        CurrentTime currentTime = new CurrentTime();
        ssystem.setUpdateTime(currentTime.getTime());
        return ssystemMapper.updateByPrimaryKey(ssystem);
    }

    @Override
    public int deleteSystem(int id) {
        return ssystemMapper.deleteByPrimaryKey(id);
    }
}

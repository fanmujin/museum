package com.muzi.museum.service.impl;

import com.muzi.museum.bean.Work;
import com.muzi.museum.dao.WorkMapper;
import com.muzi.museum.service.IWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IWorkServiceImpl implements IWorkService{
    @Autowired
    WorkMapper workMapper;
    @Override
    public List<Work> findAllWork() {
        return workMapper.selectAllWork();
    }

    @Override
    public Work findWorkById(int id) {
        return workMapper.selectByPrimaryKey(id);
    }
}

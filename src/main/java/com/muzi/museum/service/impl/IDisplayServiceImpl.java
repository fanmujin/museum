package com.muzi.museum.service.impl;

import com.muzi.museum.bean.Display;
import com.muzi.museum.bean.extend.DisplayVM;
import com.muzi.museum.dao.DisplayMapper;
import com.muzi.museum.dao.extend.DisplayVMMapper;
import com.muzi.museum.service.IDisplayService;
import com.muzi.museum.utils.CurrentTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IDisplayServiceImpl implements IDisplayService {
    @Autowired
    DisplayMapper displayMapper;
    @Autowired
    DisplayVMMapper displayVMMapper;
    @Override
    public List<Display> findAllDisplay() {
        return displayMapper.selectDisplay();
    }

    @Override
    public Display findDisplayById(int id) {
        return displayMapper.selectByPrimaryKey(id);
    }

    @Override
    public DisplayVM finDisplayPictureById(int id) {
        return displayVMMapper.selectDisplayByDisplayId(id);
    }

    @Override
    public int addDisplay(Display display) {
        CurrentTime currentTime = new CurrentTime();
        display.setCreateTime(currentTime.getTime());
        return displayMapper.updateByPrimaryKey(display);
    }

    @Override
    public int updateByPrimaryKey(Display display) {
        CurrentTime currentTime = new CurrentTime();
        display.setUpdateTime(currentTime.getTime());
        return displayMapper.updateByPrimaryKey(display);
    }

    @Override
    public int deleteDisplay(int id) {
        return displayMapper.deleteByPrimaryKey(id);
    }
}

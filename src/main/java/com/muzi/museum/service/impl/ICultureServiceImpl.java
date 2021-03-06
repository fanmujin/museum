package com.muzi.museum.service.impl;

import com.muzi.museum.bean.Culture;
import com.muzi.museum.bean.extend.CultureVM;
import com.muzi.museum.dao.CultureMapper;
import com.muzi.museum.dao.extend.CultureVMMapper;
import com.muzi.museum.service.ICultureService;
import com.muzi.museum.utils.CurrentTime;
import com.muzi.museum.web.LoginController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ICultureServiceImpl implements ICultureService {
    protected static final Logger logger = LoggerFactory.getLogger(LoginController.class);
    @Autowired
    CultureVMMapper cultureVMMapper;
    @Autowired
    CultureMapper cultureMapper;

    @Override
    public List<CultureVM> findAllCulture() {
        return cultureVMMapper.seleteAll();
    }

    @Override
    public List<Culture> findCulture() {
        return cultureMapper.selectCulture();
    }

    @Override
    public Culture findCultureById(int id) {
        return cultureMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<CultureVM> findCultureByName(String name) {
        return cultureVMMapper.seleteAllByName(name);
    }

    @Override
    public int deleteById(int id) {
        return cultureMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int addCulture(Culture culture) {
        return cultureMapper.insert(culture);
    }

    @Override
    public int updateCulture(Culture culture) {
        return cultureMapper.updateByPrimaryKey(culture);
    }
}



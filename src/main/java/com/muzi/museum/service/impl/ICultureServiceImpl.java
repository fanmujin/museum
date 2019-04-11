package com.muzi.museum.service.impl;

import com.muzi.museum.bean.Culture;
import com.muzi.museum.bean.extend.CultureVM;
import com.muzi.museum.dao.extend.CultureVMMapper;
import com.muzi.museum.service.ICultureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.Max;
import java.util.List;

@Service
public class ICultureServiceImpl implements ICultureService {
    @Autowired
    CultureVMMapper cultureVMMapper;

    @Override
    public List<CultureVM> findAllCulture() {
        return cultureVMMapper.seleteAll();
    }
}



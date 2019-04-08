package com.muzi.museum.service.impl;

import com.muzi.museum.bean.Type_picture;
import com.muzi.museum.bean.extend.TypeeVM;
import com.muzi.museum.dao.extend.TypeeVMMapper;
import com.muzi.museum.service.ITypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ITypeServiceImpl  implements ITypeService {
    @Autowired
    TypeeVMMapper typeeVMMapper;
    @Override
    public List<TypeeVM> findAll() {
        return typeeVMMapper.selectAll();
    }
}

package com.muzi.museum.service.impl;

import com.muzi.museum.bean.Type_picture;
import com.muzi.museum.dao.Type_pictureMapper;
import com.muzi.museum.service.IType_PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IType_PictureServiceImpl implements IType_PictureService {
    @Autowired
    private Type_pictureMapper type_pictureMapper;

    @Override
    public int insert(Type_picture type_picture) {
        return type_pictureMapper.insert(type_picture);
    }
}

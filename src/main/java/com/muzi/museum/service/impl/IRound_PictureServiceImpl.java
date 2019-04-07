package com.muzi.museum.service.impl;

import com.muzi.museum.bean.Round_picture;
import com.muzi.museum.bean.extend.RoundVM;
import com.muzi.museum.dao.Round_pictureMapper;
import com.muzi.museum.service.IRoundService;
import com.muzi.museum.service.IRound_PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IRound_PictureServiceImpl implements IRound_PictureService {
    @Autowired
    Round_pictureMapper round_pictureMapper;


    @Override
    public List<Round_picture> findAll() {
        return round_pictureMapper.selectAll();
    }
}

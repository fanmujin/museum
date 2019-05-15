package com.muzi.museum.service.impl;

import com.muzi.museum.bean.Video;
import com.muzi.museum.dao.VideoMapper;
import com.muzi.museum.service.IVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;

@Service
public class IVideoServiceImpl implements IVideoService {
    @Autowired
    VideoMapper videoMapper;

    @Override
    public List<Video> findAll() {
        return videoMapper.selectAll();
    }

    @Override
    public int deleteById(int id) {
        Video video = videoMapper.selectByPrimaryKey(id);
        String LocalUrl = video.getLoadUrl();
        File savedFile = new File(LocalUrl);
        savedFile.delete();
        return videoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int addVideo(Video video) {
        return videoMapper.insert(video);
    }
}

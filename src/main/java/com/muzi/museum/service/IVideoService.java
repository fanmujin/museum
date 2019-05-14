package com.muzi.museum.service;

import com.muzi.museum.bean.Video;

import java.util.List;

public interface IVideoService {
    public List<Video> findAll();

    public int deleteById(int id);

    public int addVideo(Video video);
}

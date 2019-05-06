package com.muzi.museum.service;

import com.muzi.museum.bean.Work;

import java.util.List;

public interface IWorkService {
    public List<Work> findAllWork();

    public Work findWorkById(int id);
}

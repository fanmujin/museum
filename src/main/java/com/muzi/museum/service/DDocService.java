package com.muzi.museum.service;

import com.muzi.museum.bean.DDoc;

import java.util.List;

public interface DDocService {
  public  List<DDoc> findAll();
  public  int insert(DDoc dDoc);
}

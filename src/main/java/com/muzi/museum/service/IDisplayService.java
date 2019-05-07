package com.muzi.museum.service;

import com.muzi.museum.bean.Display;
import com.muzi.museum.bean.extend.DisplayVM;

import java.util.List;

public interface IDisplayService {
    //查询所有的展览信息
    public List<Display> findAllDisplay();
    //通过id查询展览信息
    public Display findDisplayById(int id);
    //查询展览信息下面的图片信息
    public DisplayVM finDisplayPictureById(int id);
    //添加新的展览通知
    public int addDisplay(Display display);
    //更新展览信息
    public int updateByPrimaryKey(Display display);
    //删除展览信息
    public int deleteDisplay(int id);
}

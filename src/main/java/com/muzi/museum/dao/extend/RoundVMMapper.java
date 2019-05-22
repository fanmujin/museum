package com.muzi.museum.dao.extend;

import com.muzi.museum.bean.extend.RoundVM;

import java.util.List;

public interface RoundVMMapper {
    //查询所有的轮播图
    List<RoundVM> selectAll();
}

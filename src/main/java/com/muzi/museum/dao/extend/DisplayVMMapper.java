package com.muzi.museum.dao.extend;

import com.muzi.museum.bean.extend.DisplayVM;

public interface DisplayVMMapper {
    //通过ID查询左右的展览图片
    DisplayVM selectDisplayByDisplayId(int id);
}

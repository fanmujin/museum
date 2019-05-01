package com.muzi.museum.dao.extend;

import com.muzi.museum.bean.extend.DisplayVM;

public interface DisplayVMMapper {
    DisplayVM selectDisplayByDisplayId(int id);
}

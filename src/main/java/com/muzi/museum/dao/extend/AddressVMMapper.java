package com.muzi.museum.dao.extend;

import com.muzi.museum.bean.extend.AddressVM;

import java.util.List;

public interface AddressVMMapper {
    //按地区查询不同地方的名俗文化
    AddressVM selectCultureByAddressId(int id);
}

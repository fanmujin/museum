package com.muzi.museum.service.impl;

import com.muzi.museum.bean.Culture;
import com.muzi.museum.bean.extend.AddressVM;
import com.muzi.museum.bean.extend.CultureVM;
import com.muzi.museum.dao.extend.AddressVMMapper;
import com.muzi.museum.service.IAddressService;
import com.muzi.museum.service.ICultureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IAddressServiceImpl implements IAddressService {
    @Autowired
    AddressVMMapper addressVMMapper;

    @Override
    public AddressVM findAddressById(int id) {
        return addressVMMapper.selectCultureByAddressId(id);
    }
}

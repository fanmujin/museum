package com.muzi.museum.service.impl;

import com.muzi.museum.bean.Address;
import com.muzi.museum.bean.Culture;
import com.muzi.museum.bean.extend.AddressVM;
import com.muzi.museum.bean.extend.CultureVM;
import com.muzi.museum.dao.AddressMapper;
import com.muzi.museum.dao.extend.AddressVMMapper;
import com.muzi.museum.service.IAddressService;
import com.muzi.museum.service.ICultureService;
import com.muzi.museum.utils.CurrentTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IAddressServiceImpl implements IAddressService {
    @Autowired
    AddressVMMapper addressVMMapper;
    @Autowired
    AddressMapper addressMapper;
    @Override
    public AddressVM findAddressById(int id) {
        return addressVMMapper.selectCultureByAddressId(id);
    }

    @Override
    public List<Address> findByName(String name) {
        return addressMapper.selectByPrimaryWord(name);
    }

    @Override
    public int deleteById(int id) {
        return addressMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int addAddress(Address address) {
        CurrentTime currentTime = new CurrentTime();
        address.setCreateTime(currentTime.getTime());
        return addressMapper.insert(address);
    }

    @Override
    public int updateAddress(Address address) {
        CurrentTime currentTime = new CurrentTime();
        address.setUpdateTime(currentTime.getTime());
        return addressMapper.updateByPrimaryKey(address);
    }

}

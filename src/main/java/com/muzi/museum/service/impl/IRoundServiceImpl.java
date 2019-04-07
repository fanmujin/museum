package com.muzi.museum.service.impl;

import com.muzi.museum.bean.extend.RoundVM;
import com.muzi.museum.dao.extend.RoundVMMapper;
import com.muzi.museum.service.IRoundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IRoundServiceImpl  implements IRoundService {
    @Autowired
    RoundVMMapper roundVMMapper;

    @Override
    public List<RoundVM> findAllRoundVM()  {
        return roundVMMapper.selectAll();
    }
}

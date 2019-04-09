package com.muzi.museum.service.impl;

import com.muzi.museum.bean.Institutions;
import com.muzi.museum.dao.InstitutionsMapper;
import com.muzi.museum.service.IInstitutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class IInstitutionServiceImpl implements IInstitutionService {
    @Autowired
    private InstitutionsMapper institutionsMapper;


    @Override
    public List<Institutions> findAll() {
        return institutionsMapper.selectAll();
    }

    @Override
    public Institutions findInstitutionById(int id) {
        return institutionsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insert(Institutions institutions) {
        return institutionsMapper.insert(institutions);
    }

    @Override
    public int updateById(Institutions institutions) {
        return institutionsMapper.updateByPrimaryKey(institutions);
    }

    @Override
    public int deleteById(int id) {
        return institutionsMapper.deleteByPrimaryKey(id);
    }
}

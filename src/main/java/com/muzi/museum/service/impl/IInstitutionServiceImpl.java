package com.muzi.museum.service.impl;

import com.muzi.museum.bean.Institutions;
import com.muzi.museum.dao.InstitutionsMapper;
import com.muzi.museum.service.IInstitutionService;
import com.muzi.museum.utils.CurrentTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class IInstitutionServiceImpl implements IInstitutionService {
    @Autowired
    private InstitutionsMapper institutionsMapper;

    //查询所有的学术报告
    @Override
    public List<Institutions> findAll() {
        return institutionsMapper.selectAll();
    }
    //通过id查询学术报告
    @Override
    public Institutions findInstitutionById(int id) {
        return institutionsMapper.selectByPrimaryKey(id);
    }
    //插入新的学术报告
    @Override
    public int insert(Institutions institutions) {
        CurrentTime currentTime = new CurrentTime();
        institutions.setCreateTime(currentTime.getTime());
        return institutionsMapper.insert(institutions);
    }
   //修改学术报告
    @Override
    public int updateById(Institutions institutions) {
        CurrentTime currentTime = new CurrentTime();
        institutions.setUpdateTime(currentTime.getTime());
        return institutionsMapper.updateByPrimaryKey(institutions);
    }
    //通过id删除
    @Override
    public int deleteById(int id) {
        return institutionsMapper.deleteByPrimaryKey(id);
    }
}

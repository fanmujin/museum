package com.muzi.museum.service.impl;

import com.muzi.museum.bean.Admin;
import com.muzi.museum.dao.AdminMapper;
import com.muzi.museum.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class IAdminSerciveImpl implements IAdminService {
    @Autowired
    AdminMapper adminMapper;
    //查找出管理员的所有信息
    @Override
    public List<Admin> findAll() {
        return adminMapper.selectAll();
    }
    //添加管理员
    @Override
    public int insert(Admin admin) {
        return adminMapper.insert(admin);
    }
    //通过id删除管理员的详细信息
    @Override
    public int deleteByPrimaryKey(int id) {
        return adminMapper.deleteByPrimaryKey(id);
    }
    //通过id查询管理员的详细信息
    @Override
    public Admin selectByPrimaryKey(int id) {
        return adminMapper.selectByPrimaryKey(id);
    }
    //通过管理员的id更新管理员的详细信息
    @Override
    public int updateByPrimaryKey(Admin admin) {
        return adminMapper.updateByPrimaryKey(admin);
    }


}

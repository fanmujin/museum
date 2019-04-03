package com.muzi.museum.service.impl;

import com.muzi.museum.bean.User;
import com.muzi.museum.dao.UserMapper;
import com.muzi.museum.service.TestInterFace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestInterFaceImpl  implements TestInterFace {
    @Autowired
    UserMapper userMapper;
      public int testInterFace(){

          return 1;
      }
      public User testUser(){

          return new User("muzi111","muzi666");
      }
     //插入
    @Override
    public int insertUser(String username, String password) {
        return userMapper.insert(username,password);
    }
}

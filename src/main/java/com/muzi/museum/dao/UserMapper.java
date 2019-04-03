package com.muzi.museum.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
     @Insert("INSERT INTO USERINFO (username,password) VALUE (#{username},#{password})" )
    int insert (@Param("username")String username,@Param("password")String password);
}

package com.muzi.museum.dao;

import com.muzi.museum.bean.Active;
import com.muzi.museum.bean.ActiveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActiveMapper {
    int countByExample(ActiveExample example);

    int deleteByExample(ActiveExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Active record);

    int insertSelective(Active record);

    List<Active> selectByExample(ActiveExample example);

    Active selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Active record, @Param("example") ActiveExample example);

    int updateByExample(@Param("record") Active record, @Param("example") ActiveExample example);

    int updateByPrimaryKeySelective(Active record);

    int updateByPrimaryKey(Active record);
}
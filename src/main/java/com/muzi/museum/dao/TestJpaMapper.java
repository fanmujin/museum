package com.muzi.museum.dao;

import com.muzi.museum.bean.TestJpa;
import com.muzi.museum.bean.TestJpaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestJpaMapper {
    int countByExample(TestJpaExample example);

    int deleteByExample(TestJpaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TestJpa record);

    int insertSelective(TestJpa record);

    List<TestJpa> selectByExample(TestJpaExample example);

    TestJpa selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TestJpa record, @Param("example") TestJpaExample example);

    int updateByExample(@Param("record") TestJpa record, @Param("example") TestJpaExample example);

    int updateByPrimaryKeySelective(TestJpa record);

    int updateByPrimaryKey(TestJpa record);
}
package com.muzi.museum.dao;

import com.muzi.museum.bean.Rule;

import java.util.List;

public interface RuleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Rule record);

    int insertSelective(Rule record);

    Rule selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Rule record);

    int updateByPrimaryKeyWithBLOBs(Rule record);

    int updateByPrimaryKey(Rule record);

    List<Rule> selectAllRule();
}
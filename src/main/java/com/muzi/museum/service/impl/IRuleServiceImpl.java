package com.muzi.museum.service.impl;

import com.muzi.museum.bean.Rule;
import com.muzi.museum.dao.RuleMapper;
import com.muzi.museum.service.IRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IRuleServiceImpl implements IRuleService {
    @Autowired
    RuleMapper ruleMapper;
    @Override
    public List<Rule> findAllRule() {
        return ruleMapper.selectAllRule();
    }

    @Override
    public Rule findRuleById(int id) {
        return ruleMapper.selectByPrimaryKey(id);
    }
}

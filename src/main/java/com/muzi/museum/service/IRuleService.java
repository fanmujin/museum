package com.muzi.museum.service;

import com.muzi.museum.bean.Rule;

import java.util.List;

public interface IRuleService {
    public List<Rule> findAllRule();

    public Rule findRuleById(int id);
}

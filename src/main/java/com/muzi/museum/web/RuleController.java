package com.muzi.museum.web;

import com.muzi.museum.bean.Rule;
import com.muzi.museum.dao.result.Result;
import com.muzi.museum.service.IRuleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Rule")
@Api(tags = "法规 ，工作机构相应接口")
public class RuleController {
    @Autowired
    IRuleService iRuleService;

    @GetMapping("findAllRule")
    @ApiOperation(value = "查询所有的规则")
    public Result findAllRule(){
        List<Rule> list = iRuleService.findAllRule();
        return Result.success(list);
    }

    @GetMapping("findRuleById/{id}")
    @ApiOperation(value = "通过id查询详情")
    public Result findRuleById(int id){
        Rule rule = iRuleService.findRuleById(id);
        return Result.success(rule);
    }
}

package com.muzi.museum.web;

import com.muzi.museum.bean.Relation;
import com.muzi.museum.dao.result.Result;
import com.muzi.museum.service.IRelationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/relation")
@Api(tags = "Relationship")
public class RelationController {
    @Autowired
    private IRelationService iRelationService;
    //查询所有网站的联系方式
    @GetMapping("findAll")
    @ApiOperation(value = "查询所有的网站联系方式")
    public Result findAll(){
        List<Relation> list = iRelationService.findAll();
        return Result.success(list);
    }
    //通过id查询网站联系方式
    @GetMapping("findRelationById/{id}")
    @ApiOperation(value = "通过id查询网站的联系信息")
    public Result findRelationById(@PathVariable  int id){
        Relation relation = iRelationService.findRelationById(id);
        return  Result.success(relation);
    }
    //增加新的网站联系方式
    @PostMapping("insertRelation")
    @ApiOperation(value = "添加新的网站联系方式")
    public String insertRelation(Relation relation){
        int re = iRelationService.insert(relation);
        return re > 0 ? "SUCCESS" :"ERROR";
    }
    //修改联系信息
    @PostMapping("updateRelationById")
    @ApiOperation(value = "通过id进行修改")
    public String updateRelationById(Relation relation){
        int re = iRelationService.updateRelation(relation);
        return re > 0 ? "SUCCESS" : "ERROR";
    }
    //通过id删除联系信息
    @GetMapping("deleteRelationById/{id}")
    @ApiOperation(value = "通过id删除联系信息")
    public String deleteRelationById(@PathVariable int id){
        int re = iRelationService.deleteRelationById(id);
        return re > 0 ? "SUCCESS" : "ERROR";
    }
}

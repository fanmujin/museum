package com.muzi.museum.web;

import com.muzi.museum.bean.Active;
import com.muzi.museum.service.ActiveService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Active")
@Api(tags = "展览活动")
public class ActiveController {
    @Autowired
    ActiveService activeService;


    @GetMapping("findAll")
    @ApiOperation( "查询全部活动")
    @ResponseBody
    public List<Active> findAll(){
       List<Active>  result = activeService.findAll();
        return result;
    }
    @GetMapping("findByPrimaryKey")
    @ApiOperation("通过id查询")
    @ResponseBody
    public Active findByPrimaryKey(int id){
        Active result = activeService.seleteByPrimaryKey(id);
        return result;
    }
    @ResponseBody
    @PostMapping("addActive")
    @ApiOperation("添加新的活动")
    public  String addActive(Active active){
        int result = activeService.insert(active);
        return result > 0 ? "SUCCESS" : "ERROR";
    }

    @GetMapping("deleteByPrimaryKey/{id}")
    @ApiOperation("通过id删除活动")
    public String deleteByPrimaryKey(int id){
        int result = activeService.deleteByPrimaryKey(id);
        return result > 0 ? "SUCCESS" : "ERROR";
    }
    @PostMapping("update")
    @ApiOperation("更新会展活动")
    public String update(Active active){
        int result = activeService.updateByPrimaryKey(active);
        return result > 0 ? "SUCCESS" : "ERROR";
    }
}

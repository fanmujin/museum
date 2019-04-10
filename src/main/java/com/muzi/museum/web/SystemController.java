package com.muzi.museum.web;

import com.muzi.museum.bean.Ssystem;
import com.muzi.museum.dao.result.Result;
import com.muzi.museum.service.ISystemService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/system")
@Api("系统配置")
public class SystemController {
     @Autowired
    ISystemService iSystemService;
     //查询所有的系统配置
     @GetMapping("findAllWeb")
     @ApiOperation(value = "查询所有的系统配置")
    public Result findAllWeb(){
         List<Ssystem> list = iSystemService.findAll();
         return Result.success(list);
     }
     //通过id查询系统配置
    @GetMapping("findWebById/{id}")
    @ApiOperation(value = "通过id查询系统配置")
    public Result findWebById(int id){
         Ssystem ssystem = iSystemService.findSystemById(id);
         return Result.success(ssystem);
    }
    //插入新的系统配置
    @PostMapping("insertWeb")
    @ApiOperation(value = "插入新的系统配置")
    public String insertWeb(Ssystem ssystem){
         int re  = iSystemService.insertSystem(ssystem);
         return re > 0 ? "SUCCESS" : "ERROR";
    }
    //修改系统配置
    @PostMapping("updateWeb")
    @ApiOperation(value = "修改新的系统配置")
    public String updateWeb(Ssystem ssystem){
         int re = iSystemService.updateSystem(ssystem);
         return re > 0 ? "SUCCESS" : "ERROR";
    }
    //删除系统配置
    @GetMapping("deleteWebById/{id}")
    @ApiOperation(value = "通过id删除系统配置")
    public String deleteWebById(int id){
         int re = iSystemService.deleteSystem(id);
         return re > 0 ? "SUCCESS" : "ERROR";
    }
}

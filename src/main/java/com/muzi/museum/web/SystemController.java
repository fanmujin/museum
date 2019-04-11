package com.muzi.museum.web;

import com.muzi.museum.bean.Ssy;
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
@Api(tags = "系统配置")
public class SystemController {
     @Autowired
    ISystemService iSystemService;
     //查询所有的系统配置
     @GetMapping("findAllSystem")
     @ApiOperation(value = "查询所有的系统配置")
    public Result findAllSystem(){
         List<Ssy> list = iSystemService.findAll();
         return Result.success(list);
     }
     //通过id查询系统配置
    @GetMapping("findSystemById/{id}")
    @ApiOperation(value = "通过id查询系统配置")
    public Result findSystemById(int id){
         Ssy ssy = iSystemService.findSystemById(id);
         return Result.success(ssy);
    }
    //插入新的系统配置
    @PostMapping("insertSystem")
    @ApiOperation(value = "插入新的系统配置")
    public String insertSystem(Ssy ssy){
         int re  = iSystemService.insertSystem(ssy);
         return re > 0 ? "SUCCESS" : "ERROR";
    }
    //修改系统配置
    @PostMapping("updateSystem")
    @ApiOperation(value = "修改新的系统配置")
    public String updateWeb(Ssy ssy){
         int re = iSystemService.updateSystem(ssy);
         return re > 0 ? "SUCCESS" : "ERROR";
    }
    //删除系统配置
    @GetMapping("deleteSystemById/{id}")
    @ApiOperation(value = "通过id删除系统配置")
    public String deleteWebById(int id){
         int re = iSystemService.deleteSystem(id);
         return re > 0 ? "SUCCESS" : "ERROR";
    }
}

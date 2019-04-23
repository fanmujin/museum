package com.muzi.museum.web;

import com.muzi.museum.bean.Webb;
import com.muzi.museum.dao.result.Result;
import com.muzi.museum.service.IWebbService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = "Web")
@RequestMapping("/webb")

public class WebController {
    @Autowired
    IWebbService iWebbService;
    //查询所有的相关网站
    @GetMapping("findAllWeb")
    @ApiOperation(value = "查询所有的相关网站")
    public Result findAllWeb(){
        List<Webb> list = iWebbService.findAll();
        return Result.success(list);
    }
    //通过id查询相关的网站
    @GetMapping("findWebById/{id}")
    @ApiOperation(value = "通过id查询相关网站")
    public Result findWebById(int id){
        Webb webb = iWebbService.findWebById(id);
        return Result.success(webb);
    }
   //增加相关网站信息
    @PostMapping("insertWeb")
    @ApiOperation(value = "添加新的网站信息")
    public String insertWeb(Webb webb){
        int re = iWebbService.insertWeb(webb);
        return re > 0 ? "SUCCESS" : "ERROR";
    }
  //修改原有的相关网站信息
    @PostMapping("updateWeb")
    @ApiOperation(value = "通过id更新网站信息")
    public String updateWeb(Webb webb){
        int re = iWebbService.updateWebById(webb);
        return re > 0 ? "SUCCESS" : "ERROR";
    }
   //删除原有的相关网站信息
    @GetMapping("deleteWebById/{id}")
    @ApiOperation(value = "通过id删除web")
    public String deleteWebById(@PathVariable int id){
        int re = iWebbService.deletWebById(id);
        return re > 0 ? "SUCCESS" : "ERROR";
    }
}

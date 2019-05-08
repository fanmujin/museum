package com.muzi.museum.web;

import com.muzi.museum.bean.Digital;
import com.muzi.museum.dao.result.Result;
import com.muzi.museum.service.IDigitalService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/digital")
@Api(tags = "Digital")
public class DigitalController {
    @Autowired
    IDigitalService iDigitalService;
    //根据名字模糊查询网上展厅的信息
    @GetMapping("findByWord")
    @ApiOperation(value = "通过名字模糊查找展厅信息")
    public Result findByWord(@RequestParam("name") String name){
        List<Digital> list = iDigitalService.findDigitalByPrimaryWord(name);
        return Result.success(list);
    }
    //根据ID修改网上展厅的信息
    @PostMapping("updateById")
    @ApiOperation(value = "通过ID修改网上展厅的信息")
    public String updateById(Digital digital,
                             @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") @RequestParam Date creat,
                             @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") @RequestParam Date updatee){
        digital.setCreateTime(creat);
        digital.setUpdateTime(updatee);
        int re = iDigitalService.updateByPrimaryKey(digital);
        return re > 0 ? "SUCCESS" : "ERROR";
    }
    //通过id删除网上展厅信息
    @DeleteMapping("deleteById")
    @ApiOperation(value = "通过ID删除网上展厅")
    public String deleteById(@RequestParam("id") int id){
        int re = iDigitalService.deleteByPrimaryKey(id);
        return re > 0 ? "SUCCESS" : "ERROR";
    }
    //增加新的网上展厅信息
    @PostMapping("addDigital")
    @ApiOperation(value = "添加新的网上展厅")
    public String addDigital(Digital digital){
        int re = iDigitalService.addDigital(digital);
        return re > 0 ? "SUCCESS" : "ERROR";
    }
}
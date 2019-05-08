package com.muzi.museum.web;

import com.muzi.museum.bean.Digital;
import com.muzi.museum.dao.result.Result;
import com.muzi.museum.service.IDigitalService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
}

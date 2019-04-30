package com.muzi.museum.web;

import com.muzi.museum.bean.Display;
import com.muzi.museum.dao.result.Result;
import com.muzi.museum.service.IDisplayService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = "Dispaly")
@RequestMapping("/dispaly")
public class DisplayController {
    @Autowired
    IDisplayService iDisplayService;

    //查询所有的展览信息
    @GetMapping("findAllDisplay")
    @ApiOperation(value = "通过id查询相关网站")
    public Result findAllDisplay(){
        List<Display> list = iDisplayService.findAllDisplay();
        return Result.success(list);
    }
    //通过id查询展览信息
    @GetMapping("findDisplayById/{id}")
    @ApiOperation(value = "查询displaycha查询展览信息")
    public Result findDisplayById(int id){
        Display display = iDisplayService.findDisplayById(id);
        return Result.success(display);
    }
}

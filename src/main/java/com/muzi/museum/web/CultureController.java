package com.muzi.museum.web;

import com.muzi.museum.bean.extend.CultureVM;
import com.muzi.museum.dao.result.Result;
import com.muzi.museum.service.ICultureService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/culture")
@Api(tags = "文化名俗")
public class CultureController {
    @Autowired
    ICultureService iCultureService;
    @GetMapping("findAllCulture")
    @ApiOperation(value = "查找所有的文化名俗详情")
    public Result findAllCulture(){
        List<CultureVM> list = iCultureService.findAllCulture();
        return Result.success(list);
    }
}

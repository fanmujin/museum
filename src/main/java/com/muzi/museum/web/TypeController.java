package com.muzi.museum.web;

import com.muzi.museum.bean.Type_picture;
import com.muzi.museum.bean.extend.TypeeVM;
import com.muzi.museum.dao.result.Result;
import com.muzi.museum.service.ITypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = "名俗类别")
@RequestMapping("/typee")
public class TypeController {
    @Autowired
    ITypeService iTypeService;

    //查询所有的名俗类别
    @GetMapping("finAllType")
    @ApiOperation("查询所有的名俗类别")
    public Result finAllType(){
        List<TypeeVM> list = iTypeService.findAll();
        return Result.success(list);
    }
}

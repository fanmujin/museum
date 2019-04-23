package com.muzi.museum.web;

import com.muzi.museum.bean.Typee;
import com.muzi.museum.bean.extend.TypeeVM;
import com.muzi.museum.dao.result.Result;
import com.muzi.museum.service.ITypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = "Culture-Type")
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
    //保存获更新名俗的类别
    @PostMapping("saveOrupdateType")
    @ApiOperation(value = "保存或更新名俗类别的接口")
    public String saveOrupdateType(TypeeVM typeeVM){
      try{
          iTypeService.saveOrupdateTypeeVM(typeeVM);
          return "Success";
      }catch (Exception e){
          e.printStackTrace();
          return e.getMessage();
      }
    }
    //删除名俗类别
    @GetMapping("deleteById")
    @ApiOperation(value = "通过id删除名俗类别")
    public String deleteById(int id){
       int re = iTypeService.delectById(id);
        return re > 0 ? "SUCCESS" : "ERROE";
    }
}

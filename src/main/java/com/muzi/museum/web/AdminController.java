package com.muzi.museum.web;

import com.muzi.museum.bean.Admin;
import com.muzi.museum.dao.result.Result;
import com.muzi.museum.service.IAdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@Api(tags = "管理员")
@RequestMapping("/Manager")
public class AdminController {

    @Autowired
    IAdminService iAdminService;
    //查找出所有的管理员的详细信息
    @GetMapping("findAllmanager")
    @ApiOperation("查找所有的管理员")
    public Result findAllmanager(){
        List<Admin> list = iAdminService.findAll();
        return Result.success(list);
    }
    //添加新的管理员的信息
    @PostMapping("addmanager")
    @ApiOperation(value = "添加新的管理员的详细信息")
    public String addmanager(Admin admin){
        int re = iAdminService.insert(admin);
        return re > 0 ? "SUCCESS" : "ERROR";
    }
    //通过id删除管理员的详细信息
    @GetMapping("deleteByPrimaryKey/{id}")
    @ApiOperation(value = "通过id删除管理员的详细信息")
    public String deleteByPrimaryKey(@PathVariable int id){
        int re = iAdminService.deleteByPrimaryKey(id);
        return   re > 0 ? "SUCCESS" : "ERROR";
    }
    //通过管理员的id查询管理员的详细信息
    @GetMapping("findById/{id}")
    @ApiOperation(value = "通过id查询管理员的详细信息")
    public Result findById(@PathVariable int id){
        Admin re = iAdminService.selectByPrimaryKey(id);
        return Result.success(re);
    }
    //通过管理员的id更新管理员的详细信息
    @PostMapping("updateById")
    @ApiOperation(value = "通过管理员的id更新管理员的详细信息")
    public String  updateById(Admin admin){
        int re = iAdminService.updateByPrimaryKey(admin);
        return re > 0 ? "SUCCESS" : "ERROR";
    }
}

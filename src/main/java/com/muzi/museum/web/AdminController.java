package com.muzi.museum.web;

import com.muzi.museum.bean.Admin;
import com.muzi.museum.dao.result.Result;
import com.muzi.museum.service.IAdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

@RestController
@Api(tags = "Admin")
@RequestMapping("/Manager")
public class AdminController {
    @Autowired
    IAdminService iAdminService;
    protected static final Logger logger = LoggerFactory.getLogger(AdminController.class);

    @PostMapping("/doRegister")
    public Result register(@RequestParam("name") String name, @RequestParam("password") String password){
        Admin admin=new Admin();
        admin.setAdminName(name);
        admin.setAdminPassword(password);
        HashMap data=new HashMap();
        data.put("status",false);
        int pt=iAdminService.insert(admin);
        logger.info("pt:"+pt);
        if(pt>0){
            data.put("status",true);
            data.put("name",name);
        }
        return Result.success(data);
    }
    @PostMapping("/doLogin")
    public Result login(@RequestParam("name") String name, @RequestParam("password") String password){
        List<Admin> listAdmin=iAdminService.findAll();
        HashMap data=new HashMap();
        data.put("status",false);
        if(listAdmin!=null){
            for (Admin admin:listAdmin) {
                logger.info(admin.getAdminName()+":"+admin.getAdminPassword());
                if(admin.getAdminName().equals(name)&&admin.getAdminPassword().equals(password)){
                    logger.info("login successfully!");
                    data.put("status",true);
                    data.put("name",name);
                    break;
                }
            }
        }
        return Result.success(data);
    }
    //第二种登录方式
    @PostMapping("/Login")
    public Result Login(@RequestParam("name") String name, @RequestParam("password") String password){
         Admin admin = iAdminService.findAdmin(name);
        if(admin.getAdminName().equals(name)&&admin.getAdminPassword().equals(password)){
            return Result.success(admin);
        }else {
            return Result.failure();
        }
    }
    //查找出所有的管理员的详细信息
    @GetMapping("findAllmanager")
    @ApiOperation("查找所有的管理员")
    public Result findAllmanager(){
        List<Admin> list = iAdminService.findAll();
        return Result.success(list);
    }

    //添加新的管理员的信息
    @PostMapping("Register")
    @ApiOperation(value = "添加新的管理员的详细信息")
    public String addmanager(Admin admin){
        int re = iAdminService.insert(admin);
        return re > 0 ? "SUCCESS" : "ERROR";
    }
    //通过id删除管理员的详细信息
    @DeleteMapping("deleteByPrimaryKey")
    @ApiOperation(value = "通过id删除管理员的详细信息")
    public String deleteByPrimaryKey(@RequestParam("id") int id){
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
    public String  updateById(Admin admin,@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") @RequestParam Date cdate){
        //将后台传来的参数转化为时间格式，并且赋值给admin.createaTime
        admin.setCreateTime(cdate);
        int re = iAdminService.updateByPrimaryKey(admin);
        return re > 0 ? "SUCCESS" : "ERROR";
    }
    //通过管理员的name查询管理员的信息
    @PostMapping("findByName")
    @ApiOperation(value = "通过管理员的name查询信息")
    public Result findByName(@RequestParam("name") String name){
        List<Admin> list = iAdminService.findByName(name);
        return Result.success(list);
    }
}

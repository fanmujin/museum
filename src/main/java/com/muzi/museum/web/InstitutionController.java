package com.muzi.museum.web;

import com.muzi.museum.bean.Institutions;
import com.muzi.museum.dao.result.Result;
import com.muzi.museum.service.IInstitutionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@Api(tags = "学术前沿")
@RequestMapping("/institution")
public class InstitutionController {
    @Autowired
    IInstitutionService iInstitutionService;

    //查询所有的学术报告
    @GetMapping("getAllInstitution")
    @ApiOperation(value = "查询所有的学术报告")
    public Result getAllInstitution(){
        List<Institutions> list = iInstitutionService.findAll();
        return Result.success(list);
    }
    //通过id查询学术报告
    @GetMapping("getInstitutionByid/{id}")
    @ApiOperation(value = "通过id查询学术报告")
    public Result getInstitutionByid(@PathVariable int id){
        Institutions institutions = iInstitutionService.findInstitutionById(id);
        return Result.success(institutions);
   }
   //插入学术报告
    @PostMapping("insertInstitution")
    @ApiOperation(value = "插入学术研究报告")
    public String insertInstitution(Institutions institutions){
        int re = iInstitutionService.insert(institutions);
        return re > 0 ? "SUCCESS" : "ERROR";
    }
    //通过id修改学术报告
    @PostMapping("updateById/{id}")
    @ApiOperation(value = "修改学术研究报告")
    public  String updateById(Institutions institutions){
        int re = iInstitutionService.insert(institutions);
        return re > 0 ? "SUCCESS" : "ERROR";
    }
    //通过id删除学术报告
    @GetMapping("deleteById/{id}")
    @ApiOperation(value = "通过id删除学术id")
    public String deleteById(int id){
        int re = iInstitutionService.deleteById(id);
        return re > 0 ? "SUCCESS" : "ERROR";
    }
}

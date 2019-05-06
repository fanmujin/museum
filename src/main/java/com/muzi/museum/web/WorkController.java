package com.muzi.museum.web;

import com.muzi.museum.bean.Work;
import com.muzi.museum.dao.result.Result;
import com.muzi.museum.service.IWorkService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/Work")
@Api(tags = "Work")
public class WorkController {
      @Autowired
    IWorkService iWorkService;
      @GetMapping("findAllWork")
      @ApiOperation(value = "查询所有的工作机构")
      public Result findAllWork(){
          List<Work> list = iWorkService.findAllWork();
          return Result.success(list);
      }
      @GetMapping("findWorkById/{id}")
      @ApiOperation(value = "查询机构通过id")
     public Result findWorkById(int id){
           Work work = iWorkService.findWorkById(id);
           return Result.success(work);
      }
}

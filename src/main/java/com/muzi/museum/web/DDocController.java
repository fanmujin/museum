package com.muzi.museum.web;

import com.muzi.museum.bean.DDoc;
import com.muzi.museum.service.DDocService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/DDoc")
@Api(tags = "文档管理")
public class DDocController {
    //private final static String TAG="DDocController";
 @Autowired
    DDocService dDocService;
 @GetMapping("findAll")
 @ApiOperation("查询所有文档")
    @ResponseBody
    public List<DDoc> findAll(){
     List<DDoc> result = dDocService.findAll();
    // System.out.println(TAG+" "+result.toArray());
     return result;
 }
 @ApiOperation("添加文档")
    @PostMapping("add")
 public String insert(DDoc dDoc){

     //插入数据
     int result = dDocService.insert(dDoc);
     //根据插入的结果返回对应的请求结果
     return result>0 ? "SUCCESS" : "error";
 }
}

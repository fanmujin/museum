package com.muzi.museum.web;

import com.muzi.museum.bean.DDoc;
import com.muzi.museum.dao.result.Result;
import com.muzi.museum.service.IDDocService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/DDoc")
@Api(tags = "文档管理")
public class DDocController {
  @Autowired
  private StringRedisTemplate stringRedisTemplate;
 @Autowired
 IDDocService IDDocService;
 @GetMapping("findAll")
 @ApiOperation("查询所有文档")
    @ResponseBody
    public List<DDoc> findAll(){
     List<DDoc> result = IDDocService.findAll();
    // System.out.println(TAG+" "+result.toArray());
     return result;
 }
 @ApiOperation("添加文档")
    @PostMapping("add")
 public String insert(DDoc dDoc){

     //插入数据
     int result = IDDocService.insert(dDoc);
     //根据插入的结果返回对应的请求结果
     return result>0 ? "SUCCESS" : "error";
 }
   @ApiOperation("通过id查询")
    @GetMapping("get/{id}")
    public DDoc get(@PathVariable int id){
     DDoc dDoc = IDDocService.selectByPrimaryKey(id);
     return dDoc;
   }
   @ApiOperation("Result 通过ID查询")
   @GetMapping("getDDoc/{id}")
   public Result getDDoc(@PathVariable int  id){
     DDoc dDoc = IDDocService.selectByPrimaryKey(id);
     return  Result.success(dDoc);
   }
   @ApiOperation("通过id删除")
    @GetMapping("deleteByPrimaryKey/{id}")
    public String  deleteByPrimaryKey(@PathVariable int id){
     int result = IDDocService.deleteByPrimaryKey(id);
     return result > 0 ? "SUCCESS" : "ERROR";
   }
   @ApiOperation("通过id修改")
    @PostMapping("updateByPrimaryKey")
    public String updateByPrimaryKey( DDoc dDoc){
     int result = IDDocService.updateByPrimaryKey(dDoc);
     return result > 0 ? "SUCCESS" : "ERROR";
   }

}

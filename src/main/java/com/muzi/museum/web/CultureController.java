package com.muzi.museum.web;

import com.muzi.museum.bean.Culture;
import com.muzi.museum.bean.extend.CultureExtend;
import com.muzi.museum.bean.extend.CultureVM;
import com.muzi.museum.dao.result.Result;
import com.muzi.museum.service.ICultureService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/culture")
@Api(tags = "Culture")
public class CultureController {
    protected static final Logger logger = LoggerFactory.getLogger(LoginController.class);
    @Autowired
    ICultureService iCultureService;
    @GetMapping("findAllCulture")
    @ApiOperation(value = "查找所有的文化名俗详情")
    public Result findAllCulture(){
        List<CultureVM> list = iCultureService.findAllCulture();
        return Result.success(list);
    }
    @GetMapping("findCulture")
    @ApiOperation(value = "查询文化的description")
    public Result findCulture(){
        List<Culture> list = iCultureService.findCulture();
        return Result.success(list);
    }
    @GetMapping("findCultureById")
    @ApiOperation(value = "通过cultureID查询文化详细信息")
    public Result findCultureById(@RequestParam("id") int id){
        Culture re = iCultureService.findCultureById(id);
        return Result.success(re);
    }
    @GetMapping("findCultureByName/{name}")
    @ApiOperation(value = "通过name查询名俗文化")
    public Result findCultureByName(@PathVariable("name") String name){
        logger.info(name);
        Culture re = iCultureService.findCultureByName(name);
        logger.info("result:"+re);
        return Result.success(re);
    }
    @PostMapping("saveOrupdateCulture")
    @ApiOperation(value = "添加或修改名俗文化")
    public String SaveOrUpdate(){
        return "Success";
    }
    //通过ID删除Culture
    @DeleteMapping("deleteById")
    @ApiOperation(value = "删除文化")
    public String deleteById(@RequestParam ("id") int id){
        int re = iCultureService.deleteById(id);
        return (re>0)? "Success" : "ERROR";
    }
}

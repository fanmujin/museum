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
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
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
        if(re.getId() > 0) {
            return Result.success(re);
        }else {
            return Result.failure();
        }
    }
    @GetMapping("findCultureByName")
    @ApiOperation(value = "通过name查询名俗文化")
    public Result findCultureByName(@RequestParam("name") String name){
        logger.info(name);
        List<CultureVM> list = iCultureService.findCultureByName(name);
        return Result.success(list);
    }
    @PostMapping("saveOrupdateCulture")
    @ApiOperation(value = "添加或修改名俗文化")
    public String SaveOrUpdate(Culture culture,
                               @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") @RequestParam Date creat){
        culture.setCreateTime(creat);
        int id = culture.getId();
        if(id > 0){
            int res = iCultureService.updateCulture(culture);
            return (res>0)? "SUCCESS" : "ERROR";
        }
        else {
            int res = iCultureService.addCulture(culture);
            return (res>0)? "SUCCESS" : "ERROR";
        }
    }
    //通过ID删除Culture
    @DeleteMapping("deleteById")
    @ApiOperation(value = "删除文化")
    public String deleteById(@RequestParam ("id") int id){
        int re = iCultureService.deleteById(id);
        return (re>0)? "Success" : "ERROR";
    }
}

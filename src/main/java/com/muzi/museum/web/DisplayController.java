package com.muzi.museum.web;

import com.muzi.museum.bean.Display;
import com.muzi.museum.bean.extend.DisplayVM;
import com.muzi.museum.dao.result.Result;
import com.muzi.museum.service.IDisplayService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@Api(tags = "Dispaly")
@RequestMapping("/dispaly")
public class DisplayController {
    @Autowired
    IDisplayService iDisplayService;

    //查询所有的展览信息
    @GetMapping("findAllDisplay")
    @ApiOperation(value = "通过id查询相关网站")
    public Result findAllDisplay() {
        List<Display> list = iDisplayService.findAllDisplay();
        return Result.success(list);
    }

    //通过id查询展览信息
    @GetMapping("findDisplayById")
    @ApiOperation(value = "查询displaycha查询展览信息")
    public Result findDisplayById(@RequestParam("id") int id) {
        Display display = iDisplayService.findDisplayById(id);
        return Result.success(display);
    }

    //通过Display的id查询下面的图片信息
    @GetMapping("findDisplayPictureById/{id}")
    @ApiOperation(value = "查询display的图片信息")
    public DisplayVM findDisplayPictureById(int id) {
        DisplayVM displayVM = iDisplayService.finDisplayPictureById(id);
        return displayVM;
    }

    //添加新的展览信息
    @PostMapping("addDisplay")
    @ApiOperation(value = "添加新的display")
    public String addDisplay(Display display,
                             @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") @RequestParam Date start,
                             @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") @RequestParam Date end) {
        display.setDiapalyStartdate(start);
        display.setDisplayEnddate(end);
        int re = iDisplayService.addDisplay(display);
        return re > 0 ? "SUCCESS" : "ERROR";
    }

    //更新展览信息
    @PostMapping("updateDisplay")
    @ApiOperation(value = "更新展栏消息")
    public String updateDisplay(Display display,
                                @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") @RequestParam Date start,
                                @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") @RequestParam Date end) {
        display.setDiapalyStartdate(start);
        display.setDisplayEnddate(end);
        int re = iDisplayService.updateByPrimaryKey(display);
        return re > 0 ? "SUCCESS" : "ERROR";
    }
    //删除展览信息
    @DeleteMapping("deleteById")
    @ApiOperation(value = "删除展览信息")
    public String deleteById(@RequestParam ("id") int id){
        int re = iDisplayService.deleteDisplay(id);
        return re > 0 ? "SUCCESS" : "ERROR";
    }
}

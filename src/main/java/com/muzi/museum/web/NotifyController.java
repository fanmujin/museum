package com.muzi.museum.web;

import com.muzi.museum.bean.Notify;
import com.muzi.museum.dao.result.Result;
import com.muzi.museum.service.INotifyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notify")
@Api(tags = "Notify")
public class NotifyController {
    @Autowired
    INotifyService iNotifyService;
    //查询所有的通知消息
    @GetMapping("findAll")
    @ApiOperation(value = "查询所有的通知消息")
    public Result findAll(){
        List<Notify> list = iNotifyService.findAll();
        return Result.success(list);
    }
    //通过id查询通知消息
    @GetMapping("findNotifyById/{id}")
    @ApiOperation(value = "通过id查询通知消息")
    public Result findNotifyById(@PathVariable int id){
        Notify notify = iNotifyService.findNotifyById(id);
        return Result.success(notify);
    }
    //添加新的通知消息
    @PostMapping("insertNotify")
    @ApiOperation(value = "添加新的通知消息")
    public String insertNotify(Notify notify){
        int re = iNotifyService.insertNotify(notify);
        return re > 0 ? "SUCCESS" : "ERROR";
    }
    //修改原有的通知消息
    @PostMapping("updateNotifyById")
    @ApiOperation(value = "修改原有的通知消息")
    public String updateNotifyById(Notify notify){
        int re = iNotifyService.uodateNotifyById(notify);
        return re > 0 ? "SUCCESS" : "ERROR";
    }
    //通过id删除原有的通知
    @GetMapping("deleteNotifyById/{id}")
    @ApiOperation(value = "通过id删除原有的消息通知")
    public String deleteNotifyById(@PathVariable int id){
        int re = iNotifyService.deleteNotifyById(id);
        return re > 0 ? "SECCESS" : "ERROR";
    }
}

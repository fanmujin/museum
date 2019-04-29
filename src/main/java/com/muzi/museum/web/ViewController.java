package com.muzi.museum.web;

import com.muzi.museum.bean.Notify;
import com.muzi.museum.service.INotifyService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/notifyView")
public class ViewController {

    @Autowired
    INotifyService iNotifyService;

    //通过id查询通知消息
    @GetMapping("findNotifyById/{id}")
    @ApiOperation(value = "通过id查询通知消息")
    public String findNotifyById(@PathVariable int id ,@RequestParam String origin, Model model){
        Notify notify = iNotifyService.findNotifyById(id);
        model.addAttribute("notify", notify);
        model.addAttribute("origin",origin);
        return "notify_view";
    }

}

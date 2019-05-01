package com.muzi.museum.web;

import com.muzi.museum.bean.Institutions;
import com.muzi.museum.bean.Notify;
import com.muzi.museum.bean.extend.DisplayVM;
import com.muzi.museum.service.IDisplayService;
import com.muzi.museum.service.IInstitutionService;
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
@RequestMapping("/View")
public class ViewController {

    @Autowired
    INotifyService iNotifyService;
    @Autowired
    IDisplayService iDisplayService;
    @Autowired
    IInstitutionService iInstitutionService;
    //通过id查询通知消息
    @GetMapping("findNotifyById/{id}")
    @ApiOperation(value = "通过id查询通知消息")
    public String findNotifyById(@PathVariable int id ,@RequestParam String origin, Model model){
        Notify notify = iNotifyService.findNotifyById(id);
        model.addAttribute("notify", notify);
        model.addAttribute("origin",origin);
        return "notify_view";
    }
    //通过id查询展览消息
    @GetMapping("finddisplayById/{id}")
    @ApiOperation(value = "通过id查询信息展览")
    public String finddisplayById(@PathVariable int id ,@RequestParam String origin, Model model){
        DisplayVM displayVM = iDisplayService.finDisplayPictureById(id);
        model.addAttribute("display", displayVM);
        model.addAttribute("origin",origin);
        return "display_view";
    }
    //通过id查询学术消息
    @GetMapping("findInstitutionById/{id}")
    @ApiOperation(value = "通过id查询学术信息")
    public String findInstitutionById(@PathVariable int id ,@RequestParam String origin, Model model){
        Institutions institutions = iInstitutionService.findInstitutionById(id);
        model.addAttribute("institutions", institutions);
        model.addAttribute("origin",origin);
        return "institutions_view";
    }
}

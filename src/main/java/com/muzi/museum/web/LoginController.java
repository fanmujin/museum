package com.muzi.museum.web;

import com.muzi.museum.bean.Admin;
import com.muzi.museum.service.IAdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class LoginController {
    protected static final Logger logger = LoggerFactory.getLogger(LoginController.class);
    @Autowired
    IAdminService iAdminService;
    @PostMapping("/doLogin")
    public String login(Model model,@RequestParam("name") String name, @RequestParam("password") String password){
        logger.info("name:"+name+" password:"+password);
        List<Admin> listAdmin=iAdminService.findAll();
        if(listAdmin!=null){
            for (Admin admin:listAdmin) {
                logger.info(admin.getAdminName()+":"+admin.getAdminPassword());
                if(admin.getAdminName().equals(name)&&admin.getAdminPassword().equals(password)){
                    logger.info("login successfully!");
                    model.addAttribute("status",1);
                    model.addAttribute("name",name);
                    return "index";
                }
            }
        }
        model.addAttribute("status",0);
        return "failed";
    }
}

package com.muzi.museum.controller;

import com.muzi.museum.bean.User;
import com.muzi.museum.service.TestInterFace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private TestInterFace testInterFace;

    @RequestMapping("/get")
    @ResponseBody
    User testUser(){
        return testInterFace.testUser();
    }
    @RequestMapping("/add")
    @ResponseBody
    String add(){
        testInterFace.insertUser("吴磊","123456");
      return "SUCCESS" ;
    }
}

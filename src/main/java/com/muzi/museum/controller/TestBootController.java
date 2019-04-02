package com.muzi.museum.controller;

import com.muzi.museum.bean.User;
import com.muzi.museum.service.TestInterFace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
/*
@EnableAutoConfiguration

@ComponentScan(basePackages = {"com.muzi.museum.service"})
 */
@RequestMapping("test")
public class TestBootController {
    @Autowired
    private TestInterFace testInterFace;

    @RequestMapping("/num")
    @ResponseBody
    int home() {
      int i = testInterFace.testInterFace();
      return i;
    }


    @RequestMapping("/get")
    @ResponseBody
    User getuser(){
        return testInterFace.testUser();
    }
}
package com.muzi.museum.web;

import com.muzi.museum.dao.result.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    /**
     * 本地访问内容地址 ：http://localhost:8080/hello
     * @param map
     * @return
     */
    protected static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping("/first")
    public String first() {
        //map.put("hello", "欢迎进入HTML页面");
        logger.info("called test()");
        return "index";
    }

}

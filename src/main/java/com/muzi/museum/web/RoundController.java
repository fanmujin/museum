package com.muzi.museum.web;

import com.muzi.museum.bean.extend.RoundVM;
import com.muzi.museum.dao.result.Result;
import com.muzi.museum.service.IRoundService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Round")
@Api(tags = "Round")
public class RoundController {
    @Autowired
    IRoundService iRoundService;

    @GetMapping("getAllRound")
    @ApiOperation(value = "查询所有的轮播图")

    public List<RoundVM> getAllRound(){

            List<RoundVM> list  = iRoundService.findAllRoundVM();
            return list;
    }
}

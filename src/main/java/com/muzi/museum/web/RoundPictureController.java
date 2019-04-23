package com.muzi.museum.web;

import com.muzi.museum.bean.Round_picture;
import com.muzi.museum.dao.result.Result;
import com.muzi.museum.service.IRound_PictureService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/RoudPicture")
@Api(tags = "Round-Picture")
public class RoundPictureController {

    @Autowired
    IRound_PictureService iRound_pictureService;

    @GetMapping("findALlRoundPicture")
    @ApiOperation(value = "查询全部的轮播图的图片")
    public Result findALlRoundPicture(){
        List<Round_picture> list = iRound_pictureService.findAll();
        return Result.success(list);
    }
}

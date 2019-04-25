package com.muzi.museum.web;

import com.muzi.museum.bean.extend.AddressVM;
import com.muzi.museum.dao.result.Result;
import com.muzi.museum.service.IAddressService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Address")
@Api(tags = "Address")
public class AddressController {
    @Autowired
    IAddressService iAddressService;

    @GetMapping("findAddressById/{id}")
    @ApiOperation(value = "分地区查找名俗文化信息")
    public Result findAddressById(@PathVariable("id") int id ){
        AddressVM re = iAddressService.findAddressById(id);
        return Result.success(re);
    }
}

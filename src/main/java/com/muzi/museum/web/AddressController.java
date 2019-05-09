package com.muzi.museum.web;

import com.muzi.museum.bean.Address;
import com.muzi.museum.bean.extend.AddressVM;
import com.muzi.museum.dao.result.Result;
import com.muzi.museum.service.IAddressService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

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
    //通过name模糊查询地点信息
    @GetMapping("findByName")
    @ApiOperation(value = "通过name模糊查询")
    public Result findByName(@RequestParam("name") String name){
        List<Address> list = iAddressService.findByName(name);
        return Result.success(list);
    }
    //通过id删除地点信息
    @DeleteMapping("deleteById")
    @ApiOperation(value = "通过ID删除地点信息")
    public String deleteById(@RequestParam("id") int id){
        int re = iAddressService.deleteById(id);
        return (re > 0)? "Succeess" : "Error";
    }
    //更新或者插入新的地点信息
    @PostMapping("saveAddress")
    @ApiOperation(value = "添加地点信息")
    public String saveAddress(Address address){
        int re = iAddressService.addAddress(address);
        return (re > 0)? "Succeess" : "Error";
    }
    //更新或者插入新的地点信息
    @PostMapping("updateAddress")
    @ApiOperation(value = "更新地点信息")
    public String updateAddress(Address address,
                              @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") @RequestParam Date creat){
        address.setCreateTime(creat);
        int re = iAddressService.updateAddress(address);
        return (re > 0)? "Succeess" : "Error";
    }
}

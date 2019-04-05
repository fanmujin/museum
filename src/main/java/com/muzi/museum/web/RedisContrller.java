package com.muzi.museum.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis")
public class RedisContrller {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @GetMapping("test")
    public String test() {
        //存数据
        stringRedisTemplate.opsForValue().set("my:user","pangjia");
        //取数据
        String json = stringRedisTemplate.opsForValue().get("my:user");

        return json;
    }
}

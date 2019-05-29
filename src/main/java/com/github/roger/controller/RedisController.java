package com.github.roger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {

    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    @RequestMapping(value = "/put")
    public String put() {
        redisTemplate.opsForValue().set("id", "234");
        return "OK";
    }

}

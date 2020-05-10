package com.icoding.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    StringRedisTemplate redisTemplate;

    @GetMapping("/hello")
    public String hello(){
        Long hello = redisTemplate.opsForValue().increment("hello");

        return "Hello Spring Boot Icoding；访问"+hello+"次";
    }

}

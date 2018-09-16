package com.yongze.jweb001.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

//    greeting
    @RequestMapping("/greeting/{name}")
    public String greeting(@PathVariable("name") String name) {
        return "hello, " + name;
    }

//    ko api
    @RequestMapping("/ko/{name}")
    public String ko(@PathVariable("name") String name) {
        return "ko---, " + name;
    }
}
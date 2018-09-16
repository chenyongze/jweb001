package com.yongze.jweb001.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

    @RequestMapping("/testJson.action")
    public String testJson() {
        return "testJson -to---do ";
    }
}

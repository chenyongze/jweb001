package com.yongze.jweb001.demo.controller;

import com.yongze.jweb001.demo.bean.FestFulBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

    @ResponseBody
    @RequestMapping(value="/loginByPwd.do", method= RequestMethod.GET)
    public FestFulBean<String> loginByPwd(@RequestParam String username, @RequestParam String password)
    {
        FestFulBean<String> restful = new FestFulBean<String>();
        restful.setData("hello, " + username + " welcom to my website!");
        restful.setStatus(0);
        restful.setMsg("成功");
        return restful;
    }
}

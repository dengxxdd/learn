package com.dxd.ch4.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @RequestMapping("/getname")
    public String getName(){
        return "Hello,spring boot , this is ch 4";
    }
}

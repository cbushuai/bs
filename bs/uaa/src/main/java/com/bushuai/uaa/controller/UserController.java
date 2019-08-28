package com.bushuai.uaa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: create by bushuai
 * @description: com.bushuai.uaa.controller
 * @date:2019/8/28
 */

@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping("/hello")
    public String sayHello(){
        return "hello word!";
    }

}

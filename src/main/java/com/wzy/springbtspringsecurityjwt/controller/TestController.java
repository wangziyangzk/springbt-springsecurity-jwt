package com.wzy.springbtspringsecurityjwt.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @PreAuthorize("hasAuthority('ROLE_NORMAL')")
    @RequestMapping(value = "/normal/test",method = RequestMethod.GET)
    public String test1(){
        return "ROLE_NORMAL /normal/test接口调用成功";
    }

    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @RequestMapping(value = "/admin/test",method = RequestMethod.GET)
    public String test2(){
        return "ROLE_ADMIN /admin/test接口调用成功";
    }
}

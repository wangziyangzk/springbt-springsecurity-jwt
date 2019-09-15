package com.wzy.springbtspringsecurityjwt.controller;

import com.wzy.springbtspringsecurityjwt.model.User;
import com.wzy.springbtspringsecurityjwt.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private AuthService authService;

    /*
    **  登录操作
     *  @return token
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(String username,String password){
        return authService.login(username, password);
    }

    /*
    **  注册操作
    *   @return User
     */
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public User register(@RequestBody User user){
        return authService.register(user);
    }

}

package com.wzy.springbtspringsecurityjwt.service;


import com.wzy.springbtspringsecurityjwt.model.User;

public interface AuthService {
    User register(User user);

    String login(String username,String password);
}

package com.springboot.controller;


import com.springboot.entity.UserInfo;
import com.springboot.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping
    public List<UserInfo> createUser(@RequestBody UserInfo userInfo){
        return userService.saveUser(userInfo);
    }


}

package com.springboot.service;

import com.springboot.entity.UserInfo;

import java.util.List;

public interface UserService {


    List<UserInfo> saveUser(UserInfo userInfo);
}

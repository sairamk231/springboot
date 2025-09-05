package com.springboot.service.impl;

import com.springboot.entity.UserInfo;
import com.springboot.repo.UserRepo;
import com.springboot.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepo userRepo;

    public UserServiceImpl(UserRepo userRepo){
        this.userRepo = userRepo;
    }

    public List<UserInfo> saveUser(UserInfo userInfo) {
    if(userInfo.getUserName()==null){
        throw new IllegalArgumentException("Name should not empty");
    }
        return Collections.singletonList(userRepo.save(userInfo));
    }
}

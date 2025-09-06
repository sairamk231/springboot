package com.springboot.service;

import com.springboot.entity.UserInfo;
import com.springboot.model.request.UserRequest;
import com.springboot.model.response.UserResponse;
import jakarta.validation.Valid;

import java.util.List;

public interface UserService {

    List<UserResponse> getAll();

    UserResponse getById(Integer id);

    UserResponse create(UserRequest request);

    UserResponse update(Integer id, UserRequest request);

    void delete(Integer id);

    List<UserResponse> findUsersByCity(String city); // custom
    //   List<UserInfo> saveUser(UserInfo userInfo);
}

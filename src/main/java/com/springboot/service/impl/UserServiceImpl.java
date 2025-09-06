package com.springboot.service.impl;

import com.springboot.entity.Occupation;
import com.springboot.entity.UserInfo;
import com.springboot.mapper.UserMapper;
import com.springboot.model.request.UserRequest;
import com.springboot.model.response.UserResponse;
import com.springboot.repo.OccupationRepo;
import com.springboot.repo.UserRepo;
import com.springboot.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {


    private final UserRepo repo;
    private final UserMapper mapper;

    public UserServiceImpl(UserRepo repo, UserMapper mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    @Override
    public List<UserResponse> getAll() {
        return repo.findAll().stream().map(mapper::toUserResponse).toList();
    }

    @Override
    public UserResponse getById(Integer id) {
        return repo.findById(id)
                .map(mapper::toUserResponse)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    @Override
    public UserResponse create(UserRequest request) {
        UserInfo entity = mapper.toEntity(request);
        return mapper.toUserResponse(repo.save(entity));
    }

    @Override
    public UserResponse update(Integer id, UserRequest request) {
        UserInfo existing = repo.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        UserInfo updated = mapper.toEntity(request);
        updated.setUserId(existing.getUserId());
        return mapper.toUserResponse(repo.save(updated));
    }

    @Override
    public void delete(Integer id) {
        repo.deleteById(id);
    }

    @Override
    public List<UserResponse> findUsersByCity(String city) {
        return repo.findUsersByCity(city).stream().map(mapper::toUserResponse).toList();
    }

}

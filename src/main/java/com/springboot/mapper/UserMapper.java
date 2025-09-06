package com.springboot.mapper;

import com.springboot.entity.UserInfo;
import com.springboot.model.request.UserRequest;
import com.springboot.model.response.UserResponse;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {

    UserInfo toEntity(UserRequest userRequest);

    UserResponse toUserResponse(UserInfo userInfo);

}

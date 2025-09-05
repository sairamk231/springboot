package com.springboot.model.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {

    private Integer userId;

    private String userName;

    private String mobileNumber;

    private String salary;

    private Integer addressId;

    private Integer occId;
}

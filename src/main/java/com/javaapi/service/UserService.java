package com.javaapi.service;

import com.javaapi.model.dto.UserRequest;
import com.javaapi.model.dto.UserResponse;

public interface UserService {

    UserResponse create(UserRequest user);
    UserResponse update(UserRequest user);


}

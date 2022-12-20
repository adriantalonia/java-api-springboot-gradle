package com.javaapi.service;

import com.javaapi.model.dto.UserRequest;
import com.javaapi.model.dto.UserResponse;
import com.javaapi.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserResponse create(UserRequest user) {
        return null;
    }

    @Override
    public UserResponse update(UserRequest user) {
        return null;
    }
}

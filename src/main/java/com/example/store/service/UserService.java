package com.example.store.service;

import com.example.store.service.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    boolean save(UserDto userDto);
}

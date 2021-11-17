package com.example.hellospringboot.service;
import com.example.hellospringboot.entity.User;
import com.example.hellospringboot.model.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public List<UserDto> getListUser();
}

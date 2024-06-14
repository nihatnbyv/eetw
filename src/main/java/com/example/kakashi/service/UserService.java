package com.example.kakashi.service;

import com.example.kakashi.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(Long id);

    User saveUser(User user);

    void deleteUser(Long id);
}

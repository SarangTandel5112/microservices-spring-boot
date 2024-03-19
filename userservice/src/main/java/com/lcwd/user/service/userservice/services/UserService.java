package com.lcwd.user.service.userservice.services;

import java.util.List;

import com.lcwd.user.service.userservice.entities.User;

public interface UserService {

    User saveUser(User user);

    List<User> getAllUsers();

    User getUser(String userId);

    User updateUser(User user);

    void deleteUser(String userId);

}

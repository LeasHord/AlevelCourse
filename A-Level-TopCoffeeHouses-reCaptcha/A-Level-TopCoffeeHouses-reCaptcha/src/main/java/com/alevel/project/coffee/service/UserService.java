package com.alevel.project.coffee.service;

import com.alevel.project.coffee.model.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    void addNewUser(User user);

    User findByEmail(String email);

    User findByUsername(String username);

    boolean isUserExist(User user);

    boolean isEmailExist(User user);

    List<User> findAll();

    void updateUserRole(User user, String username, Map<String, String> roles, String status);

    void updateUserProfile(User user, String firstName, String lastName, String email, String password);

}

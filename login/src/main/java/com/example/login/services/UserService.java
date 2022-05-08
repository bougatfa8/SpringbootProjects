package com.example.login.services;

import java.util.List;

import com.example.login.models.Role;
import com.example.login.models.User;

public interface UserService {
    User saveUser(User user);
    User findUserByUsername (String username);
    Role addRole(Role role);
    User addRoleToUser(String username, String rolename);
    List<User> findAllUsers();
}

package com.example.login.controller;

import java.util.List;

import com.example.login.models.User;
import com.example.login.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class UserRestController {
    @Autowired
    UserService userService;


    @RequestMapping(path = "all",method = RequestMethod.GET)
    public List<User> getAllUsers() {
        return userService.findAllUsers();
    }
}

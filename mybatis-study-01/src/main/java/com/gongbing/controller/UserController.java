package com.gongbing.controller;

import com.gongbing.entity.User;
import com.gongbing.service.UserService;
import com.gongbing.test_initial.TestInitialization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private UserService userService;
    private TestInitialization testInitialization;

    public UserController(UserService userService, TestInitialization testInitialization) {
        this.userService = userService;
        this.testInitialization = testInitialization;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.findUsers();
    }

    @GetMapping("/test")
    public User getUser() {
        return testInitialization.getUser();

    }

}

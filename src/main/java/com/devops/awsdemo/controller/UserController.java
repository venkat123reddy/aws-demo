package com.devops.awsdemo.controller;


import com.devops.awsdemo.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/get")
    public User getUser() {
        return new User("admin","123");
    }
}

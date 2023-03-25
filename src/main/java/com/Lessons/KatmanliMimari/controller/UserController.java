package com.Lessons.KatmanliMimari.controller;

import com.Lessons.KatmanliMimari.dto.User;
import com.Lessons.KatmanliMimari.service.UserService;
import com.Lessons.KatmanliMimari.service.impl.UserServiceImpl;
import com.sun.source.tree.BreakTree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;   //   = new UserServiceImpl()
    @GetMapping(path = "/users/{userId}")
    public User getUserById(@PathVariable("userId") Long userId){
        return userService.getUserById(userId);
    }
}

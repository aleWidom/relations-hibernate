package com.relations.crud.controller;

import com.relations.crud.model.User;
import com.relations.crud.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private IUserService userService;
    @PostMapping("/user")
    public void crearUser(@RequestBody User user) {
        userService.crearUser(user);
    }
}












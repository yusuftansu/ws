package com.hoaxify.ws.user.rest.controller;

import com.hoaxify.ws.user.persistence.entity.User;
import com.hoaxify.ws.user.service.impl.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController  {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @PostMapping("/save")
    public User create (@Valid @RequestBody User request){
        return userService.create(request);
    }

}

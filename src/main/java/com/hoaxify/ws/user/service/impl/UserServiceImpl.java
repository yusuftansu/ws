package com.hoaxify.ws.user.service.impl;

import com.hoaxify.ws.user.persistence.entity.User;
import com.hoaxify.ws.user.persistence.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl {

    PasswordEncoder passwordEncoder;

    UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
        this.passwordEncoder = new BCryptPasswordEncoder();
    }




    public User create(User user){
        Map<String, String> validationErrors = new HashMap<>();

        String userName = user.getUsername();
        String displayName = user.getDisplayName();

        //temporary
        if(user.getPassword() == null){
            user.setPassword("password");
        }
        String Password = passwordEncoder.encode(user.getPassword());
        user.setPassword(Password);
        return userRepository.save(user);
    }
}

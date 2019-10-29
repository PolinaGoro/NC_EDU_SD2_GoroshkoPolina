package com.netcracker.backend.controllers;

import com.netcracker.backend.entity.UserProfile;
import com.netcracker.backend.repository.UserRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    UserRepository userRepository = new UserRepository();

    @RequestMapping("/users")
    public List<UserProfile> getUsers(){
        List<UserProfile> all = userRepository.getAll();
        return all;
    }

    @RequestMapping("/add")
    public void addUser(@RequestParam (value = "name", defaultValue = "World") String name){
        userRepository.insert(new UserProfile().setNickname(name));
    }
}

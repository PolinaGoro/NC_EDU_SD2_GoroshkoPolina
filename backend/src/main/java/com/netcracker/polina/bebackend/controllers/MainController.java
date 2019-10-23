package com.netcracker.polina.bebackend.controllers;

import com.netcracker.polina.bebackend.entity.User;
import com.netcracker.polina.bebackend.repository.UserRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    @RequestMapping("/users")
    public List<User> getUser(@RequestParam (value = "name",
            defaultValue = "World") String name){
        UserRepository userRepository = new UserRepository();
        return userRepository.getAll();
    }
}

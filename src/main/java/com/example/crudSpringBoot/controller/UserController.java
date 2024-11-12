package com.example.crudSpringBoot.controller;

import com.example.crudSpringBoot.entity.User;
import com.example.crudSpringBoot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="api/v1/users")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/{userId}")
    public Optional<User> getById(@PathVariable("userId") Long userId){
        return userService.getUser(userId);
    }

    @GetMapping
    public List<User> getById(){
        return userService.getUsers();
    }

    @PostMapping
    public void saveUpdate(@RequestBody User user){
         userService.saveOrUpdate(user);
    }

    @DeleteMapping("/{userId}")
    public void saveUpdate(@PathVariable("userId") Long userId){
        userService.delete(userId);
    }


}

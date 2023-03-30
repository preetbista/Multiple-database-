package com.multipledb.multidb.mysql.controller;

import com.multipledb.multidb.mysql.model.User;
import com.multipledb.multidb.mysql.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public User save(@RequestBody User user){
        return userService.save(user);
    }
    @GetMapping("/{id}")
    @Cacheable(value = "userName", key = "#id")
    public User findById( @PathVariable(value = "id") Integer id ){
        return userService.findById(id);
    }

}

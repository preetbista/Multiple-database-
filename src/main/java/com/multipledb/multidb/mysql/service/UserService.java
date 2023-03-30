package com.multipledb.multidb.mysql.service;

import com.multipledb.multidb.mysql.exception.UserNotFound;
import com.multipledb.multidb.mysql.model.User;
import com.multipledb.multidb.mysql.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public User save(User user){
        return userRepo.save(user);
    }
    public User findById( Integer id ){
        return userRepo.findById(id).orElseThrow(() -> new UserNotFound("User not found for id : "+id));
    }
}

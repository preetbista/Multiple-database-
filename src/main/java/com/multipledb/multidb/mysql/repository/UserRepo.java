package com.multipledb.multidb.mysql.repository;

import com.multipledb.multidb.mysql.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}

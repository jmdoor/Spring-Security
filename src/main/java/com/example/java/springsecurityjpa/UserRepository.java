package com.example.java.springsecurityjpa;


import  com.example.java.springsecurityjpa.models.User;
import  com.example.java.springsecurityjpa.models.MyUserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUserName(String userName);
}
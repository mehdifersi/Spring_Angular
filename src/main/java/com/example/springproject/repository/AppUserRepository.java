package com.example.springproject.repository;

import com.example.springproject.entities.User;

import java.util.Optional;


public interface AppUserRepository extends BaseRepository<User,Integer>  {


    Optional<User> findByEmail(String email);
    Optional<User> findByUsernameOrEmail(String username, String email);
   User findByUsername(String username);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
}

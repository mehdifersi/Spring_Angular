package com.example.springproject.repository;

import com.example.springproject.entities.Users;


public interface UsersRepository extends BaseRepository<Users,Integer> {

//
//    Optional<Users> findByEmail(String email);
//    @Transactional
//    @Modifying
//    @Query("UPDATE Users a " +
//            "SET a.enabled = TRUE WHERE a.email = ?1")
//    int enableAppUser(String email);
}

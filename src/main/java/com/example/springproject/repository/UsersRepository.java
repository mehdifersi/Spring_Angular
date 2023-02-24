package com.example.springproject.repository;

import com.example.springproject.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends BaseRepository<Users,Integer> {
}

package com.example.springproject.repository;

import com.example.springproject.entities.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlocRepository extends JpaRepository<Bloc,Integer> {
}

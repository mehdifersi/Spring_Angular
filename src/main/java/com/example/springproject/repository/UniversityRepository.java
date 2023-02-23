package com.example.springproject.repository;

import com.example.springproject.entities.University;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversityRepository extends JpaRepository<University,Integer> {
}

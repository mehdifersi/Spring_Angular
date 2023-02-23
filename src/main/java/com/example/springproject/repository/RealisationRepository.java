package com.example.springproject.repository;

import com.example.springproject.entities.Realisation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RealisationRepository extends JpaRepository<Realisation,Integer> {
}

package com.example.springproject.repository;

import com.example.springproject.entities.Realisation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RealisationRepository extends BaseRepository<Realisation,Integer> {
}

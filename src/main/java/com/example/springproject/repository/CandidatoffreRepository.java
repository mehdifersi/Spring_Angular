package com.example.springproject.repository;

import com.example.springproject.entities.CondidatOffre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidatoffreRepository extends BaseRepository<CondidatOffre,Integer> {
}

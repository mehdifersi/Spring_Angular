package com.example.springproject.repository;

import com.example.springproject.entities.RDV_offre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RdvoffreRepository extends BaseRepository<RDV_offre,Integer> {
}

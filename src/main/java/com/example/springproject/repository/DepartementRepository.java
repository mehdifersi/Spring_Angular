package com.example.springproject.repository;

import com.example.springproject.entities.Departement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartementRepository extends BaseRepository<Departement,Integer> {
}

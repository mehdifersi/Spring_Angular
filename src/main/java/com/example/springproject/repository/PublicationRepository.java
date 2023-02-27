package com.example.springproject.repository;

import com.example.springproject.entities.Publication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicationRepository extends BaseRepository<Publication,Integer> {
}

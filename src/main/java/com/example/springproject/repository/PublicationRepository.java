package com.example.springproject.repository;

import com.example.springproject.entities.Publication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublicationRepository extends BaseRepository<Publication,Integer> {
}

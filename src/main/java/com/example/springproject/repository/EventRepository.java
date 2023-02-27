package com.example.springproject.repository;

import com.example.springproject.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends BaseRepository<Event,Integer> {
}

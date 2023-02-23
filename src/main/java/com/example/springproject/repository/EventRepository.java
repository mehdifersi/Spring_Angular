package com.example.springproject.repository;

import com.example.springproject.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event,Integer> {
}

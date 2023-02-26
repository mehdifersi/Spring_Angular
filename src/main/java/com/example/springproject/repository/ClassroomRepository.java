package com.example.springproject.repository;

import com.example.springproject.entities.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassroomRepository extends BaseRepository<Classroom,Integer> {
}

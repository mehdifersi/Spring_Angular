package com.example.springproject.repository;

import com.example.springproject.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends BaseRepository<Comment,Integer> {
}

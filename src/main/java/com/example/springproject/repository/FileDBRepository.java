package com.example.springproject.repository;

import com.example.springproject.entities.FileDB;
import org.springframework.stereotype.Repository;

@Repository
public interface FileDBRepository extends BaseRepository<FileDB,String> {
}

package com.example.springproject.repository;

import com.example.springproject.entities.FileInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileInfoRepository extends BaseRepository<FileInfo,Integer> {
}

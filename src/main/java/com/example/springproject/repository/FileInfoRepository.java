package com.example.springproject.repository;

import com.example.springproject.entities.FileInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileInfoRepository extends JpaRepository<FileInfo,Integer> {
}

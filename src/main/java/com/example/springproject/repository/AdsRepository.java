package com.example.springproject.repository;

import com.example.springproject.entities.Ads;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdsRepository extends BaseRepository<Ads,Integer> {
}

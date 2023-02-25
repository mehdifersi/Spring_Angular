package com.example.springproject.repository;

import com.example.springproject.entities.Ads;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdsRepository extends BaseRepository<Ads,Integer> {
}

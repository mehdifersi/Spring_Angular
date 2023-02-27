package com.example.springproject.repository;

import com.example.springproject.entities.Mailingcontent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MailingRepository extends BaseRepository<Mailingcontent,Integer> {

    List<Mailingcontent> getAllByToEmail(String email);
}

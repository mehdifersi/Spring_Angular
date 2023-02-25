package com.example.springproject.repository;

import com.example.springproject.entities.Mailingcontent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MailingRepository extends BaseRepository<Mailingcontent,Integer> {

    List<Mailingcontent> getAllByToEmail(String email);
}

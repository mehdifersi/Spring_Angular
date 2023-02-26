package com.example.springproject.repository;

import com.example.springproject.entities.Complaint;
import com.example.springproject.entities.StatusComplaint;
import com.example.springproject.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ComplaintRepository extends BaseRepository<Complaint,Integer> {
//    List<Complaint> findAllByStatusOrderByDate(StatusComplaint status);
   // List<Complaint> findAllByDateOrderByIdComplaint(Date date);
   // Complaint findByIdComplaint(Integer id);
   // List<Complaint> findByUser(Users user);
    //    @Query(value = "select * from  Complaint e where e.Content = :n or e.Subject = :n or e.user.name= :n", nativeQuery = true)
    //   List<Complaint> retrieveComplaintByTerm(@Param("n") String term);

    // to be modified to include user_name
}

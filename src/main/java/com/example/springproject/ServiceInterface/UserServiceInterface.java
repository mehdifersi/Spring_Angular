package com.example.springproject.ServiceInterface;

import com.example.springproject.entities.Users;
import org.springframework.web.multipart.MultipartFile;


public interface UserServiceInterface extends BaseServiceInterface<Users,Integer> {
    public Users addStudent(Users user);

    public void addFileAndAssignToStudent(MultipartFile file, Integer idUser);

    public String LevelSuggestion(Users user);


}

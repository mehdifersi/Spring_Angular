package com.example.springproject.ServiceInterface;

import com.example.springproject.entities.NiveauSuivant;
import com.example.springproject.entities.User;
import org.springframework.web.multipart.MultipartFile;

public interface AppUserServiceInterface extends BaseServiceInterface<User,Integer>{
    public User addStudent(User user);

    public void addFileAndAssignToStudent(MultipartFile file, Integer idUser);

    public NiveauSuivant LevelSuggestion(User user);
}

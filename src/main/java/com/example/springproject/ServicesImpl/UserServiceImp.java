package com.example.springproject.ServicesImpl;

import com.example.springproject.ServiceInterface.UserServiceInterface;
import com.example.springproject.entities.FileInfo;
import com.example.springproject.entities.Users;
import com.example.springproject.repository.FileInfoRepository;
import com.example.springproject.repository.UsersRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Set;

@Service
@AllArgsConstructor
@Slf4j
public class UserServiceImp extends BaseServiceImp<Users,Integer> {

    @Autowired
    UsersRepository usersRepository ;

    @Autowired
    MailingServiceImp mailingServiceImp;

    @Autowired
    FilesStorageServiceImpl filesStorageService;

    /*@Override
    public Users addStudent(Users user) {
        mailingServiceImp.sendMailStudentConfirmation(user);
        usersRepository.save(user);
        return user;
    }

    @Override
    public void addFileAndAssignToStudent(MultipartFile file, Integer idUser) {
        filesStorageService.save(file);
        Users user = usersRepository.findById(idUser).orElse(null);
        user.getFiles().add((FileInfo) file);

    }

    @Override
    public String LevelSuggestion(Users user) {
        return null;
    }
 */

}

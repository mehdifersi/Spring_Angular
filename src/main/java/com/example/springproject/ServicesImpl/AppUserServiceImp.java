package com.example.springproject.ServicesImpl;

import com.example.springproject.ServiceInterface.AppUserServiceInterface;
import com.example.springproject.entities.*;

import com.example.springproject.repository.AppUserRepository;
import io.jsonwebtoken.lang.Assert;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

import static com.example.springproject.entities.NiveauSuivant.*;


@Service
@AllArgsConstructor
@Slf4j
public class AppUserServiceImp extends BaseServiceImp<User,Integer> implements UserDetailsService, AppUserServiceInterface {
    private final AppUserRepository appUserRepository;

    @Autowired
    AppUserRepository userRepository ;

    @Autowired
    MailingServiceImp mailingServiceImp;

    @Autowired
    FilesStorageServiceImpl filesStorageService;
    @Override
    public UserDetails loadUserByUsername(String username) throws
            UsernameNotFoundException {
        User user = appUserRepository.findByUsername(username);
        Assert.notNull(user,
                new UsernameNotFoundException(username).getMessage());
        return new org.springframework.security.core.userdetails.User(user.getUsername()
                , user.getPassword()
                , getAuthorities(user.getRole()));
    }

    private List<GrantedAuthority> getAuthorities(Role userRole) {
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(userRole.name()));
        return authorities;

    }

    @Override
    public User addStudent(User user) {
        mailingServiceImp.sendMailStudentConfirmation(user);
        userRepository.save(user);
        return user;
    }

    @Override
    public void addFileAndAssignToStudent(MultipartFile file, Integer idUser) {
        filesStorageService.save(file);
        User user = userRepository.findById(idUser).orElse(null);
        user.getFiles().add((FileInfo) file);
    }

    @Override
    public NiveauSuivant LevelSuggestion(User user) {

        if (user.getNiveauActuel().equals(NiveauActuel.valueOf("BAC"))){
            user.setNiveauSuivant(A1);
        } else if (user.getNiveauActuel().equals(NiveauActuel.valueOf("PREPA1ER"))) {
            user.setNiveauSuivant(P2);
        } else if (user.getNiveauActuel().equals(NiveauActuel.valueOf("PREPA2EME"))) {
            user.setNiveauSuivant(B3);
        } else if (user.getNiveauActuel().equals(NiveauActuel.valueOf("LICENCE3EMEINFO"))) {
            user.setNiveauSuivant(A3);
        } else if (user.getNiveauActuel().equals(NiveauActuel.valueOf("LICENCE3EMENONINFO"))) {
            user.setNiveauSuivant(B3);
        } else if (user.getNiveauActuel().equals(NiveauActuel.valueOf("MASTERE1ER"))) {
            user.setNiveauSuivant(A4);
        }

        return user.getNiveauSuivant();
    }
}
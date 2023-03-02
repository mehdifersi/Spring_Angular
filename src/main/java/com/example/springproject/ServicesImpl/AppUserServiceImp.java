package com.example.springproject.ServicesImpl;

import com.example.springproject.entities.User;

import com.example.springproject.entities.Role;
import com.example.springproject.repository.AppUserRepository;
import io.jsonwebtoken.lang.Assert;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@AllArgsConstructor
@Slf4j
public class AppUserServiceImp extends BaseServiceImp<User,Integer> implements UserDetailsService {
    private final AppUserRepository appUserRepository;

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
}
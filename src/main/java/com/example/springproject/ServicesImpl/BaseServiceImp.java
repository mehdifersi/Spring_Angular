package com.example.springproject.ServicesImpl;

import com.example.springproject.ServiceInterface.BaseServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;
public class BaseServiceImp<T, id> implements BaseServiceInterface<T, id>{


    @Autowired
    JpaRepository<T, id> jpaRepo;

    @Override
    public List<T> retrieveAll() {
        return new ArrayList<>(this.jpaRepo.findAll());
    }

    @Override
    public T add(T e) {
        return this.jpaRepo.save(e);
    }

    @Override
    public T update(T e) {
        return this.jpaRepo.save(e);
    }

    @Override
    public T retrieve(id id) {
        return this.jpaRepo.findById(id).orElse(null);
    }

    @Override
    public void remove(id id) {
        this.jpaRepo.deleteById(id);

    }









}

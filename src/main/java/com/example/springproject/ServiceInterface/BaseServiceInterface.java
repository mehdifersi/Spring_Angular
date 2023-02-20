package com.example.springproject.ServiceInterface;

import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface BaseServiceInterface<T, id> {


    public List<T> retrieveAll();
    public T add (T e);
    public T update (T e);
    public T retrieve (id id);
    public void remove(id id);



}
package com.example.springproject.controller;


import com.example.springproject.ServiceInterface.BaseServiceInterface;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public abstract class BaseController<T, id> {



    BaseServiceInterface<T, id> baseService;

    @GetMapping()
    public List<T> getAll(){

        return baseService.retrieveAll();

    }


    @PostMapping("/add")
    public ResponseEntity<T> add(@RequestBody T e){
        System.out.println(e);
        return ResponseEntity.ok(this.baseService.add(e));


    }


    // @PutMapping(path ="{id}")

    @PutMapping("/update")
    public ResponseEntity<T>update(@RequestBody T e){

        return ResponseEntity.ok(this.baseService.update(e));


    }



    @GetMapping("/{id}")
    public T retrieveById(@PathVariable("id") id id) {

        return this.baseService.retrieve(id);

    }


    @DeleteMapping("/delete/{id}")
    public void remove(@PathVariable("id") id id) {

        this.baseService.remove(id);

    }

}
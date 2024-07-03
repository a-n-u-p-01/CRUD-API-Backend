package com.example.CURD.RestAPI.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class Controller {

    @Autowired
    private StudentServices studentServices;

//Create
    @PostMapping
    public void create(@RequestBody Student student){
        studentServices.create(student);
    }

//Update
    @PutMapping
    public void update(@RequestBody Student student){
        studentServices.update(student);
    }
//Read
    @GetMapping
    public List<Student> read(){
        return studentServices.read();
    }
//Delete
    @DeleteMapping("/{roll}")
    public void delete(@PathVariable int roll){
        studentServices.delete(roll);
    }


}

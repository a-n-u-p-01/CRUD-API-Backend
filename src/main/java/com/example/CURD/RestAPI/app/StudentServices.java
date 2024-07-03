package com.example.CURD.RestAPI.app;

import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;


@Component
public class StudentServices {
    private List<Student> students = new ArrayList<>();

    //create
    public void create(Student student){
        students.add(student);
    }
    //Update
    public void update(Student student){
        students.removeIf(e->e.getRollNo() == student.getRollNo());
        students.add(student);
    }
    //Read
    public List<Student> read(){
        return students;
    }
    //Delete
    public boolean delete(int roll){
        students.removeIf( e -> e.getRollNo()==roll);
        return true;
    }

}

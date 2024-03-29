package com.example.demo.service;

import com.example.demo.model.Student;

import java.util.Optional;

public interface StudentService {

    Student save(Student student);
    Optional<Student> get(Long id);
}

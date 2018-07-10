package com.example.cat.service;

import com.example.cat.domain.Student;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Service;

import java.util.List;

@EnableFeignClients
@Service
public interface StudentService {

    Student createStudent(Student student);
    List<Student>findAll();
}

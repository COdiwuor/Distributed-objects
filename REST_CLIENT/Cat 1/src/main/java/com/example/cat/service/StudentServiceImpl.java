package com.example.cat.service;

import com.example.cat.domain.Student;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Service;

import java.util.List;

@EnableFeignClients
@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public Student createStudent(Student student) {
        return null;
    }

    @Override
    public List<Student> findAll() {
        return null;
    }


}

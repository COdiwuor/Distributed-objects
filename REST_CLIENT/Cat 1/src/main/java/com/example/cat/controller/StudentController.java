package com.example.cat.controller;

import com.example.cat.domain.Student;
import com.example.cat.repository.StudentRepository;
import com.example.cat.service.StudentService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "students")
public class StudentController {
     private final StudentService studentService;
     private final StudentRepository studentRepository;

    public StudentController(StudentService studentService, StudentRepository studentRepository) {
        this.studentService = studentService;
        this.studentRepository = studentRepository;
    }

    @PostMapping
    public Student createStudent(
            @Validated(Student.class)
            @RequestBody Student student){
        return studentService.createStudent(student);
    }

    @GetMapping
    public List<Student> getAllStudents() {

        return studentService.findAll();
    }
}

package com.example.cat;

import com.example.cat.client.StudentClient;
import com.example.cat.controller.StudentController;
import com.example.cat.domain.Student;
import com.example.cat.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;

public class DummyData implements CommandLineRunner {
    public final StudentController studentController;
    public final StudentClient studentClient;
    public final StudentRepository studentRepository;

    public DummyData(StudentController studentController, StudentClient studentClient, StudentRepository studentRepository) {
        this.studentController = studentController;
        this.studentClient = studentClient;
        this.studentRepository = studentRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Student student = studentRepository.save(new Student("89406","Jack Gitonga") );
//        studentRepository.save(new Student("89406","Jack Gitonga"));
        studentClient.testclient();
    }
}

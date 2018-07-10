package com.example.cat.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "students")
public class Student {
    private  String admissionNumber;
    private  String fullName;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Student(String admissionNumber, String fullName) {
        this.admissionNumber = admissionNumber;
        this.fullName = fullName;
    }

    protected Student() {
    }

    public String getAdmissionNumber() {
        return admissionNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

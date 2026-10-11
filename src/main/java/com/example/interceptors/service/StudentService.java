package com.example.interceptors.service;

import com.example.interceptors.dto.Studentdto;
import com.example.interceptors.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void create(){
        studentRepository.save();
        System.out.println("service layer");
    }
}

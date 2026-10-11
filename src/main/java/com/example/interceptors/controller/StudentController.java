package com.example.interceptors.controller;

import com.example.interceptors.dto.Studentdto;
import com.example.interceptors.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public String createStudent(Studentdto request){
         studentService.create();
        System.out.println("Controller layer");
         return "Done";

    }
}

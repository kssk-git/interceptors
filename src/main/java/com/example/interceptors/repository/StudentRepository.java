package com.example.interceptors.repository;

import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
    public void save(){
        System.out.println("repository layer");
    }
}

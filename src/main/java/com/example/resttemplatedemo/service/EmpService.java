package com.example.resttemplatedemo.service;

import com.example.resttemplatedemo.model.Emp;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmpService {


    List<Emp> findAll();
    List<Emp> findByAgeGreaterThan30(int age);
}

package com.example.resttemplatedemo.service;

import com.example.resttemplatedemo.model.Emp;
import com.example.resttemplatedemo.model.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmpServiceImpl implements EmpService {
    private final RestTemplate restTemplate;
    final String Url = "https://dummy.restapiexample.com/api/v1/employees";

    @Autowired
    public EmpServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<Emp> findAll() {
        Employees response = restTemplate.getForObject(Url, Employees.class);
        return Arrays.asList(response.getEmpData());
    }

    @Override
    public List<Emp> findByAgeGreaterThan30(int age) {
        Employees response = restTemplate.getForObject(Url, Employees.class);
//        List<Emp> empList = Arrays.asList(response.getEmpData());
//        return empList.stream().filter(e -> e.getEmployee_age()>age).collect(Collectors.toList());
        return Arrays.stream(response.getEmpData()).filter(e -> e.getEmployee_age()>age).collect(Collectors.toList());

    }
}

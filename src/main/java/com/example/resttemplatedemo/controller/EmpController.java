package com.example.resttemplatedemo.controller;

import com.example.resttemplatedemo.model.Emp;
import com.example.resttemplatedemo.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmpController {
    private final EmpService empService;

    @Autowired
    EmpController(EmpService empService){
        this.empService = empService;
    }
    @GetMapping
    public ResponseEntity<List<Emp>> findAll(){
        return new ResponseEntity<>(empService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/30")
    public ResponseEntity<List<Emp>> findByAgeGreaterThan30(){
        return new ResponseEntity<>(empService.findByAgeGreaterThan30(), HttpStatus.OK);
    }
}

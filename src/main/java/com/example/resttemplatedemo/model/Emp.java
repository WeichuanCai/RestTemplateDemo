package com.example.resttemplatedemo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Emp {
    private Integer id;
    private String employee_name;
    private Long employee_salary;
    private Integer employee_age;
    private String profile_image;
}

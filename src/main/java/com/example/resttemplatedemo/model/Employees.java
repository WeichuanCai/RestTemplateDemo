package com.example.resttemplatedemo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Employees {
    @JsonProperty("status")
    private String status;
    @JsonProperty("data")
    private Emp[] empData;
}

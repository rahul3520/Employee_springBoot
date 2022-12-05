package com.example.employeeapp_backend.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/")
    public String WelcomePage()
    {
        return "Employee Welcome page";
    }

    @GetMapping("/add")
    public String AddEmployee()
    {
        return "Employee add page";
    }

}

package com.example.employeeapp_backend.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/")
    public String WelcomePage()
    {
        return "Employee Welcome page";
    }

    @PostMapping("/add")
    public String AddEmployee()
    {
        return "Employee add page";
    }

    @PostMapping("/search")
    public String SearchEmployee()
    {
        return "Employee search page";
    }

    @PostMapping("/edit")
    public String EditEmployee()
    {
        return "Employee edit page";
    }

    @GetMapping("/viewall")
    public String ViewallEmployee()
    {
        return "View all Employees page";
    }

    @PostMapping("/delete")
    public String DeleteEmployee()
    {
        return "Delete Employee page";
    }

}

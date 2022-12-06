package com.example.employeeapp_backend.controller;


import com.example.employeeapp_backend.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/")
    public String WelcomePage()
    {
        return "Employee Welcome page";
    }

    @PostMapping(path = "/add",produces = "application/json",consumes = "application/json")
    public String AddEmployee(@RequestBody Employee e)
    {
        System.out.println(e.getEmpCode().toString());
        System.out.println(e.getName().toString());
        System.out.println(e.getDesignation().toString());
        System.out.println(e.getSalary());
        System.out.println(e.getCompanyName().toString());
        System.out.println(e.getMobileNo().toString());
        System.out.println(e.getUsername().toString());
        System.out.println(e.getPassword().toString());
        return "Employee add page";
    }

//    @PostMapping(path ="/search",produces = "application/json",consumes = "application/json")
//    public String SearchEmployee()
//    {
//        return "Employee search page";
//    }
//
//    @PostMapping(path = "/edit",produces = "application/json",consumes = "application/json")
//    public String EditEmployee()
//    {
//        return "Employee edit page";
//    }
//
//    @GetMapping(path = "/viewall",produces = "application/json",consumes = "application/json")
//    public String ViewallEmployee()
//    {
//        return "View all Employees page";
//    }
//
//    @PostMapping(path = "/delete",produces = "application/json",consumes = "application/json")
//    public String DeleteEmployee()
//    {
//        return "Delete Employee page";
//    }

}

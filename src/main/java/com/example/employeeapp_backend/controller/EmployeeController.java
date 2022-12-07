package com.example.employeeapp_backend.controller;


import com.example.employeeapp_backend.dao.EmployeeDao;
import com.example.employeeapp_backend.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeDao dao;

    @GetMapping("/")
    public String WelcomePage()
    {
        return "Employee Welcome page";
    }

    @CrossOrigin(origins="*")
    @PostMapping(path = "/add",produces = "application/json",consumes = "application/json")
    public HashMap<String,String> AddEmployee(@RequestBody Employee e)
    {
        HashMap<String,String> map=new HashMap<>();

        System.out.println(e.toString());
        System.out.println(e.getEmpCode().toString());
        System.out.println(e.getName().toString());
        System.out.println(e.getDesignation().toString());
        System.out.println(e.getSalary());
        System.out.println(e.getCompanyName().toString());
        System.out.println(e.getMobileNo().toString());
        System.out.println(e.getUsername().toString());
        System.out.println(e.getPassword().toString());

        dao.save(e);

        map.put("status","success");
        return map;
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path ="/search",produces = "application/json",consumes = "application/json")
    public List<Employee> SearchEmployee(@RequestBody Employee e)
    {
        String empcode=String.valueOf(e.getEmpCode());
        System.out.println(empcode);
        return (List<Employee>) dao.SearchEmployee(e.getEmpCode());
    }

    @PostMapping(path = "/edit",produces = "application/json",consumes = "application/json")
    public String EditEmployee()
    {
        return "Employee edit page";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewall")
    public List<Employee> ViewallEmployee()
    {
        return (List<Employee>) dao.findAll();
    }

    @PostMapping(path = "/delete",produces = "application/json",consumes = "application/json")
    public String DeleteEmployee()
    {
        return "Delete Employee page";
    }

}

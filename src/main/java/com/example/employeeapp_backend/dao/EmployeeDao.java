package com.example.employeeapp_backend.dao;

import com.example.employeeapp_backend.model.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDao extends CrudRepository<Employee,Integer> {

    @Query(value="SELECT `id`, `company_name`, `designation`, `emp_code`, `mobile_no`, `name`, `password`, `salary`, `username` FROM `employee` WHERE `emp_code`=:empCode",nativeQuery = true)
    List<Employee> SearchEmployee(@Param("empCode") String empCode);
}

package com.example.upax.controller;

import com.example.upax.entity.Employee;
import com.example.upax.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee){
        return service.saveEmployee(employee);
    }

    @GetMapping("/employees")
    public List<Employee> findAllEmployees(){
        return  service.getEmployees();
    }
    ///check java version cabmiar en xom.xml
    @GetMapping("/employees/{id}")
    public Employee findProductById(@PathVariable int id){
        return service.getEmployeeById(id);
    }


}

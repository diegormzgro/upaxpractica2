package com.example.upax.service;

import com.example.upax.entity.Employee;
import com.example.upax.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repo;

    public Employee saveEmployee(Employee employee){
        Optional<Employee> temp = repo.findByNameAndLastname(employee.getName(), employee.getLastname());
        if(temp.isPresent()){
            throw new IllegalStateException("name or last name already introduced");
        }
        return repo.save(employee);
    }

    public List<Employee> saveEmployees(List<Employee> employees){
        return repo.saveAll(employees);
    }

    public List<Employee> getEmployees(){
        return repo.findAll();
    }

    public  Employee getEmployeeById(int id){
        return repo.findById(id).orElse(null);
    }





}

package com.example.upax.repository;

import com.example.upax.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    Optional<Employee> findByNameAndLastname(String name, String lastname);





}

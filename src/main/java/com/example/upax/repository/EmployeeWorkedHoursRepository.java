package com.example.upax.repository;

import com.example.upax.entity.Employee;
import com.example.upax.entity.EmployeeWorkedHours;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeWorkedHoursRepository extends JpaRepository<EmployeeWorkedHours,Integer> {

//    Optional<EmployeeWorkedHours> findByEmployeeid(int id);

}

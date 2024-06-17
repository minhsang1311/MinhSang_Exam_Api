package com.example.employeemanagement.repository;

import com.example.employeemanagement.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

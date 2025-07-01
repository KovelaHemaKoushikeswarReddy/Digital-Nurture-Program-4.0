package com.example.employeemanagement;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employeemanagement.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

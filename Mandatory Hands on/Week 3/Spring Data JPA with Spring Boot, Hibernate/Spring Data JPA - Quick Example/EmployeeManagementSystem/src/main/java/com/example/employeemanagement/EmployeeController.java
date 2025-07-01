package com.example.employeemanagement;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeRepository repository;

    public EmployeeController(EmployeeRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Employee addEmployee(@RequestBody Employee emp) {
        return repository.save(emp);
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }
}

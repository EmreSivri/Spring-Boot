package com.training.springbootcrudmvcspringdatajpathymeleafhibernatepostgresql.service;

import com.training.springbootcrudmvcspringdatajpathymeleafhibernatepostgresql.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface EmployeeService {

    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee getByEmployeeId(int employeeId);
    Employee updateEmployee(Employee employee, int employeeId);
    void deleteEmployee(int employeeId);
}

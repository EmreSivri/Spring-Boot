package com.training.springbootcrudmvcspringdatajpathymeleafhibernatepostgresql.service;

import com.training.springbootcrudmvcspringdatajpathymeleafhibernatepostgresql.model.Employee;
import com.training.springbootcrudmvcspringdatajpathymeleafhibernatepostgresql.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getByEmployeeId(int employeeId) {
        Optional<Employee> optional = employeeRepository.findById(employeeId);
        Employee employee = null;
        if (optional.isPresent()) {
            employee = optional.get();
        } else {
            throw new RuntimeException(" Employee not found for id :: " + employeeId);
        }
        return employee;
    }

    @Override
    public Employee updateEmployee(Employee employee, int employeeId) {
        employee.setEmployeeId(employeeId);
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(int employeeId) {
        employeeRepository.deleteById(employeeId);
    }
}
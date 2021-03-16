package com.training.springbootcrudmvcspringdatajpathymeleafhibernatepostgresql.controller;

import com.training.springbootcrudmvcspringdatajpathymeleafhibernatepostgresql.model.Employee;
import com.training.springbootcrudmvcspringdatajpathymeleafhibernatepostgresql.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @RequestMapping(value = "/")
    public String viewHomePage(Model model) {
        List<Employee> employees = employeeService.getAllEmployees();
        model.addAttribute(  "listEmployees", employees);
        return "index";
    }

    @GetMapping(value = "/showNewEmployeeForm")
    public String showNewEmployeeForm(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "new_employee";
    }

    @PostMapping(value = "/saveEmployee")
    public String save(@ModelAttribute("employee") Employee employee) {
        employeeService.saveEmployee(employee);
        return "redirect:/";
    }

    @GetMapping(value = "/showFormForUpdate/{employeeId}")
    public String update(@PathVariable(value = "employeeId") int employeeId, Model model) {
        // get employee from the service
        Employee employee = employeeService.getByEmployeeId(employeeId);
        // set employee as a model attribute to pre-populate the form
        model.addAttribute("employee",employee);
        return "update_employee";
    }

    @GetMapping(value = "/deleteEmployee/{employeeId}")
    public String delete(@PathVariable(value = "employeeId") int employeeId) {
        employeeService.deleteEmployee(employeeId);
        return "redirect:/";
    }


}

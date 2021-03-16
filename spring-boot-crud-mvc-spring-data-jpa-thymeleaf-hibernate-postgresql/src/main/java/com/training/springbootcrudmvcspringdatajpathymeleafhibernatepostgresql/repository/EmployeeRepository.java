package com.training.springbootcrudmvcspringdatajpathymeleafhibernatepostgresql.repository;

import com.training.springbootcrudmvcspringdatajpathymeleafhibernatepostgresql.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}

package com.training.springbootcrudmvcspringdatajpathymeleafhibernatepostgresql.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "gender")
    private String gender;

    @Column(name = "age")
    private int age;

    @Column(name = "job")
    private String job;

    @Column(name = "birth_date")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate birthDate;

    @Column(name = "start_date")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate startDate;

    @Column(name = "manager_id")
    private int managerId;

    @Column(name = "salary")
    private double salary;

    @Column(name = "country")
    private String country;

    @Column(name = "city")
    private String city;

    @Column(name = "street")
    private String street;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;
}

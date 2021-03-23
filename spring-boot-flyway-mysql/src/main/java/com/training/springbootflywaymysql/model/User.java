package com.training.springbootflywaymysql.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "REGISTRATION_USERS")
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String mobile;
}

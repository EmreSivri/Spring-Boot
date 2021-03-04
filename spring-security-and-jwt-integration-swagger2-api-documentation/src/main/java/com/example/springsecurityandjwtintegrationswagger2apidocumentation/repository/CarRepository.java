package com.example.springsecurityandjwtintegrationswagger2apidocumentation.repository;

import com.example.springsecurityandjwtintegrationswagger2apidocumentation.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {

}

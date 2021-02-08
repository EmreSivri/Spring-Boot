package com.training.springbootpostgresqlcrud.repository;

import com.training.springbootpostgresqlcrud.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {

}

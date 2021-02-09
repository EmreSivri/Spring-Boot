package com.training.springbootonetomanyrestapi.repository;

import com.training.springbootonetomanyrestapi.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {

}

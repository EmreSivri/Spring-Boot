package com.training.springbootonetomanyrestapi.repository;

import com.training.springbootonetomanyrestapi.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}

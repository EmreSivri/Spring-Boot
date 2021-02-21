package com.example.springbooth2databaserestapivalidation.repository;

import com.example.springbooth2databaserestapivalidation.model.PersonInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonInformationRepository extends JpaRepository<PersonInformation, Integer> {

}

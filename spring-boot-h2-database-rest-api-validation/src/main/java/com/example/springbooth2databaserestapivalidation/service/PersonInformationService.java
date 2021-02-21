package com.example.springbooth2databaserestapivalidation.service;

import com.example.springbooth2databaserestapivalidation.model.PersonInformation;

import java.util.List;
import java.util.Optional;

public interface PersonInformationService {
    List<PersonInformation> listAll();
    Optional<PersonInformation> getById(int personId);
    PersonInformation savePerson(PersonInformation personInformation);
    void deletePerson(int personId);
    PersonInformation updatePerson(PersonInformation personInformation, int personId);
}

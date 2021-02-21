package com.example.springbooth2databaserestapivalidation.service;

import com.example.springbooth2databaserestapivalidation.model.PersonInformation;
import com.example.springbooth2databaserestapivalidation.repository.PersonInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonInformationServiceImpl implements PersonInformationService {
    private final PersonInformationRepository personInformationRepository;

    @Autowired
    public PersonInformationServiceImpl(PersonInformationRepository personInformationRepository) {
        this.personInformationRepository = personInformationRepository;
    }

    @Override
    public List<PersonInformation> listAll() {
        return personInformationRepository.findAll();
    }

    @Override
    public Optional<PersonInformation> getById(int personId) {
        return personInformationRepository.findById(personId);
    }

    @Override
    public PersonInformation savePerson(PersonInformation personInformation) {
        return personInformationRepository.save(personInformation);
    }

    @Override
    public void deletePerson(int personId) {
        personInformationRepository.deleteById(personId);
    }

    @Override
    public PersonInformation updatePerson(PersonInformation personInformation, int personId) {
        personInformation.setPersonId(personId);
        return personInformationRepository.save(personInformation);
    }
}

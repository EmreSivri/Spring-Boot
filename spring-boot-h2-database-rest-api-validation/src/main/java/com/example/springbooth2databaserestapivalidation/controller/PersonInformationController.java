package com.example.springbooth2databaserestapivalidation.controller;

import com.example.springbooth2databaserestapivalidation.model.PersonInformation;
import com.example.springbooth2databaserestapivalidation.service.PersonInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/v1")
public class PersonInformationController {

    private final PersonInformationService personInformationService;

    @Autowired
    public PersonInformationController(PersonInformationService personInformationService) {
        this.personInformationService = personInformationService;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public PersonInformation save(@RequestBody PersonInformation personInformation) {
        return personInformationService.savePerson(personInformation);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<PersonInformation> findAllPerson() {
        return personInformationService.listAll();
    }

    @RequestMapping(value = "/find/{personId}", method = RequestMethod.GET)
    public Optional<PersonInformation> findByPersonId(@PathVariable int personId) {
        return personInformationService.getById(personId);
    }

    @RequestMapping(value = "/update/{personId}", method = RequestMethod.PUT)
    public PersonInformation updatePerson(@RequestBody PersonInformation personInformation, @PathVariable int personId) {
        return personInformationService.updatePerson(personInformation, personId);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public String deletePerson(int personId) {
        personInformationService.deletePerson(personId);
        return "Person is Deleted !";
    }

}

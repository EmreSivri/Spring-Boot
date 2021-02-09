package com.training.springbootonetomanyrestapi.controller;

import com.training.springbootonetomanyrestapi.entity.Country;
import com.training.springbootonetomanyrestapi.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/country")
public class CountryController {
    @Autowired
    private CountryService countryService;

    @PostMapping(value = "/save")
    public Country save(@RequestBody Country country) {
        return countryService.saveCountry(country);
    }

    @GetMapping(value = "/getAllCountry")
    public List<Country> getAll() {
        return countryService.getAll();
    }

    @GetMapping(value = "/{countryId}")
    public Country findById(@PathVariable int countryId) {
        return countryService.findById(countryId);
    }

    @DeleteMapping(value = "/delete")
    public String delete(@RequestParam int countryId) {
        countryService.delete(countryId);
        return "COuntry is Deleted !";
    }

    @PutMapping(value = "/update")
    public Country update(@RequestBody Country country, @PathVariable int countryId) {
        return countryService.update(country, countryId);
    }

}

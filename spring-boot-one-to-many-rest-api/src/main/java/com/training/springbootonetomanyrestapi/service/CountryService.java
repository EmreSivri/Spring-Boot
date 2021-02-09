package com.training.springbootonetomanyrestapi.service;

import com.training.springbootonetomanyrestapi.entity.Country;
import com.training.springbootonetomanyrestapi.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
    @Autowired
    private CountryRepository countryRepository;

    public Country saveCountry(Country country) {
        return countryRepository.save(country);
    }

    public List<Country> getAll() {
        return countryRepository.findAll();
    }

    public Country findById(int countryId) {
        return countryRepository.findById(countryId).get();
    }

    public void delete(int countryId) {
        countryRepository.deleteById(countryId);
    }

    public Country update(Country country, int countryId) {
        country.setCountryId(countryId);
        return countryRepository.save(country);
    }

}

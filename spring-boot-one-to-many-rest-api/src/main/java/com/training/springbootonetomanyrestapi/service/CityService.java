package com.training.springbootonetomanyrestapi.service;

import com.training.springbootonetomanyrestapi.entity.City;
import com.training.springbootonetomanyrestapi.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
    @Autowired
    private CityRepository cityRepository;

    public City saveCity(City city) {
        return cityRepository.save(city);
    }

    public List<City> getAll() {
        return cityRepository.findAll();
    }

    public City getById(int cityId) {
        return cityRepository.findById(cityId).get();
    }

    public void delete(int cityId) {
        cityRepository.deleteById(cityId);
    }

    public City update(City city, int cityId) {
        city.setCityId(cityId);
        return cityRepository.save(city);
    }
}

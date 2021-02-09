package com.training.springbootonetomanyrestapi.controller;

import com.training.springbootonetomanyrestapi.entity.City;
import com.training.springbootonetomanyrestapi.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/city")
public class CityController {
    @Autowired
    private CityService cityService;

    @PostMapping(value = "/save")
    public City save(@RequestBody City city) {
        return cityService.saveCity(city);
    }

    @GetMapping(value = "/getAllCity")
    public List<City> getAll() {
        return cityService.getAll();
    }

    @GetMapping(value = "/{cityId}")
    public City getById(@PathVariable int cityId) {
        return cityService.getById(cityId);
    }

    @DeleteMapping(value = "/{cityId}")
    public String delete(@RequestParam int cityId) {
        cityService.delete(cityId);
        return "City is Deleted !";
    }

    @PutMapping(value = "/update")
    public City update(@RequestBody City city, @PathVariable int cityId) {
        return cityService.update(city, cityId);
    }

}

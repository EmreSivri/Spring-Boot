package com.training.springbootpostgresqlcrud.controller;

import com.training.springbootpostgresqlcrud.model.Car;
import com.training.springbootpostgresqlcrud.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/car")
public class CarController {
    @Autowired
    private CarService carService;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public Car save(@RequestBody Car car) {
        return carService.saveCar(car);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Car> findAllCar() {
        return carService.listAll();
    }

    @RequestMapping(value = "/find/{car_id}", method = RequestMethod.GET)
    public Optional<Car> findByCarId(@PathVariable int car_id) {
        return carService.getById(car_id);
    }

    @RequestMapping(value = "/update/{car_id}", method = RequestMethod.PUT)
    public Car UpdateCar(@RequestBody Car car, @RequestBody int car_id) {
        return carService.updateCar(car, car_id);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public String deleteCar(@RequestParam int car_id) {
        carService.deleteCar(car_id);
        return "Car is Deleted !";
    }
}

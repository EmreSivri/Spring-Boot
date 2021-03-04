package com.example.springsecurityandjwtintegrationswagger2apidocumentation.service;

import com.example.springsecurityandjwtintegrationswagger2apidocumentation.model.Car;

import java.util.List;
import java.util.Optional;

public interface CarService {

    List<Car> listAll();

    Optional<Car> getById(int carId);

    Car saveCar(Car car);

    void deleteCar(int carId);

    Car updateCar(Car car, int carId);
}

package com.training.springbootpostgresqlcrud.service;

import com.training.springbootpostgresqlcrud.model.Car;

import java.util.List;
import java.util.Optional;

public interface CarService {

    List<Car> listAll();
    Optional<Car> getById(int car_id);
    Car saveCar(Car car);
    void deleteCar(int car_id);
    Car updateCar(Car car, int car_id);
}

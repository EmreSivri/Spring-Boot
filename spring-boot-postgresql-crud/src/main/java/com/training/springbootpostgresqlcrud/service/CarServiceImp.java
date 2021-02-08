package com.training.springbootpostgresqlcrud.service;

import com.training.springbootpostgresqlcrud.model.Car;
import com.training.springbootpostgresqlcrud.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImp implements CarService{
    @Autowired
    private CarRepository carRepository;

    @Override
    public List<Car> listAll() {
        return carRepository.findAll();
    }

    @Override
    public Optional<Car> getById(int car_id) {
        return carRepository.findById(car_id);
    }

    @Override
    public Car saveCar(Car car) {
        return carRepository.save(car);
    }

    @Override
    public void deleteCar(int car_id) {
        carRepository.deleteById(car_id);
    }

    @Override
    public Car updateCar(Car car, int car_id) {
        car.setCarId(car_id);
        return  carRepository.save(car);
    }
}

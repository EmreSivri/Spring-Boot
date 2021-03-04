package com.example.springsecurityandjwtintegrationswagger2apidocumentation.service;

import com.example.springsecurityandjwtintegrationswagger2apidocumentation.model.Car;
import com.example.springsecurityandjwtintegrationswagger2apidocumentation.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImpl implements CarService{

    @Autowired
    private CarRepository carRepository;

    @Override
    public List<Car> listAll() {
        return carRepository.findAll();
    }

    @Override
    public Optional<Car> getById(int carId) {
        return carRepository.findById(carId);
    }

    @Override
    public Car saveCar(Car car) {
        return carRepository.save(car);
    }

    @Override
    public void deleteCar(int carId) {
        carRepository.deleteById(carId);
    }

    @Override
    public Car updateCar(Car car, int carId) {
        car.setCarId(carId);
        return carRepository.save(car);
    }
}

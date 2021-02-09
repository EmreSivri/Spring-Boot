package com.training.springbootswagger2apidocumentation.service;

import com.training.springbootswagger2apidocumentation.model.Vehicle;
import com.training.springbootswagger2apidocumentation.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleServiceImpl implements VehicleService{
    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public List<Vehicle> listAll() {
        return vehicleRepository.findAll();
    }

    @Override
    public Optional<Vehicle> getById(int vehicleId) {
        return vehicleRepository.findById(vehicleId);
    }

    @Override
    public Vehicle saveVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @Override
    public void deleteVehicle(int vehicleId) {
        vehicleRepository.deleteById(vehicleId);
    }

    @Override
    public Vehicle updateVehicle(Vehicle vehicle, int vehicleId) {
        vehicle.setVehicleId(vehicleId);
        return vehicleRepository.save(vehicle);
    }
}

package com.training.springbootswagger2apidocumentation.service;

import com.training.springbootswagger2apidocumentation.model.Vehicle;

import java.util.List;
import java.util.Optional;

public interface VehicleService {

    List<Vehicle> listAll();
    Optional<Vehicle> getById(int vehicleId);
    Vehicle saveVehicle(Vehicle vehicle);
    void deleteVehicle(int vehicleId);
    Vehicle updateVehicle(Vehicle vehicle, int vehicleId);
}

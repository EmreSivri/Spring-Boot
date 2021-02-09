package com.training.springbootswagger2apidocumentation.repository;

import com.training.springbootswagger2apidocumentation.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

}

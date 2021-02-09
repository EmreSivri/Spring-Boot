package com.training.springbootswagger2apidocumentation.controller;

import com.training.springbootswagger2apidocumentation.model.Vehicle;
import com.training.springbootswagger2apidocumentation.service.VehicleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/vehicle")
@Api(value = "Vehicle API Documentation")
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ApiOperation(value = "Vehicle Insertion Method",notes = "Vehicle features will be added")
    public Vehicle save(@RequestBody Vehicle vehicle){
        return vehicleService.saveVehicle(vehicle);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ApiOperation(value = "Vehicle List Method")
    public List<Vehicle> findAllVehicle(){
        return vehicleService.listAll();
    }

    @RequestMapping(value = "/find/{vehicleId}", method = RequestMethod.GET)
    @ApiOperation(value = "Vehicle Object Return Method by Id")
    public Optional<Vehicle> findByVehicleId(@PathVariable int vehicleId){
        return vehicleService.getById(vehicleId);
    }

    @RequestMapping(value = "/update/{vehicleId}", method = RequestMethod.PUT)
    @ApiOperation(value = "Vehicle Update Method", httpMethod = "PUT")
    public Vehicle updateVehicle(@RequestBody Vehicle vehicle, @PathVariable int vehicleId){
        return vehicleService.updateVehicle(vehicle,vehicleId);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @ApiOperation(value = "Vehicle Delete Method")
    public String deleteVehicle(@RequestParam int vehicleId){
        vehicleService.deleteVehicle(vehicleId);
        return "Vehicle is Deleted !";
    }
}

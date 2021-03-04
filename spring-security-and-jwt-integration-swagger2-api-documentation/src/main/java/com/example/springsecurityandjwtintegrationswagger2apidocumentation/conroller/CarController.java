package com.example.springsecurityandjwtintegrationswagger2apidocumentation.conroller;

import com.example.springsecurityandjwtintegrationswagger2apidocumentation.model.Car;
import com.example.springsecurityandjwtintegrationswagger2apidocumentation.service.CarService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/v1/car")
@Api(value = "Car API Documentation")
public class CarController {

    @Autowired
    private CarService carService;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ApiOperation(value = "Car Insertion Method", notes = "Car Features Will be Added.")
    public Car save(@RequestBody Car car) {
        return carService.saveCar(car);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ApiOperation(value = "Car List Method", notes = "Will List All the Features of the Car.", httpMethod = "GET")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success|OK"),
            @ApiResponse(code = 401, message = "not authorized"),
            @ApiResponse(code = 403, message = "forbidden!!!"),
            @ApiResponse(code = 404, message = "not found!!!"),
    })
    public List<Car> findAllCar() {
        return carService.listAll();
    }

    @RequestMapping(value = "/find/{cardId}", method = RequestMethod.GET)
    @ApiOperation(value = "Car Object Return Method by Id", notes = "The Features of the Car Will be Listed By Id", httpMethod = "GET")
    public Optional<Car> getByCarId(@PathVariable int cardId) {
        return carService.getById(cardId);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @ApiOperation(value = "Car Delete Method", httpMethod = "DELETE")
    public String deleteByCarId(@RequestParam int carId) {
        carService.deleteCar(carId);
        return "Car is deleted!";
    }

    @RequestMapping(value = "/update/{carId}", method = RequestMethod.PUT)
    @ApiOperation(value = "Car Update Method", notes = "The Features of the Car Will be Updated", httpMethod = "PUT")
    public Car update(@RequestBody Car car, @PathVariable int carId) {
        return carService.updateCar(car, carId);
    }
}

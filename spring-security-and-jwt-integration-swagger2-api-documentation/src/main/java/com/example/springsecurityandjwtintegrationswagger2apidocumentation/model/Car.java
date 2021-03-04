package com.example.springsecurityandjwtintegrationswagger2apidocumentation.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

@Entity
@Table(name = "car")
@ApiModel(value = "Car Class", description = "There are all variables that belong to our car class.")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "Singular id Field of Car Class", name = "carId", hidden = true)
    private int carId;

    @ApiModelProperty(value = "carBrand Variable of Car Class", name = "carBrand", dataType = "String", example = "BMW")
    @Column(name = "car_brand")
    private String carBrand;

    @ApiModelProperty(value = "vehicleType Variable of Car Class", name = "vehicleType", dataType = "String", example = "Binek Araç / C Segment")
    @Column(name = "vehicle_type")
    private String vehicleType;

    @ApiModelProperty(value = "model Variable of Car Class", name = "model", dataType = "String", example = "4 Series Grand Coupe 418d Prestige")
    @Column(name = "model")
    private String model;

    @ApiModelProperty(value = "color Variable of Car Class", name = "color", dataType = "String", example = "blue")
    @Column(name = "color")
    private String color;

    @ApiModelProperty(value = "modelType Variable of Car Class", name = "modelType", dataType = "String", example = "Coupe / 4 Kapı")
    @Column(name = "model_type")
    private String modelType;

    @ApiModelProperty(value = "engineType Variable of Car Class", name = "engineType", dataType = "String", example = "Dizel / 4 silindir")
    @Column(name = "engine_type")
    private String engineType;

    @ApiModelProperty(value = "productYear Variable of Car Class", name = "productYear", dataType = "String", example = "2018 / 2019")
    @Column(name = "product_year")
    private String productYear;

    @ApiModelProperty(value = "fuelType Variable of Car Class", name = "fuelType", dataType = "String", example = "Benzin / EURO 6")
    @Column(name = "fuel_type")
    private String fuelType;

    @ApiModelProperty(value = "fuelConsumption Variable of Car Class", name = "fuelConsumption", dataType = "String", example = "4,9 lt / 3,6 lt")
    @Column(name = "fuel_consumption")
    private String fuelConsumption;

    @ApiModelProperty(value = "enginePower Variable of Car Class", name = "enginePower", dataType = "Integer", example = "150")
    @Column(name = "engine_power")
    private int enginePower;

    @ApiModelProperty(value = "transmission Variable of Car Class", name = "transmission", dataType = "String", example = "Otomatik / 8 Vites / Arkadan İtiş")
    @Column(name = "transmission")
    private String transmission;

    @ApiModelProperty(value = "speedup Variable of Car Class", name = "speedup", dataType = "double", example = "8.9")
    @Column(name = "speedup")
    private double speedup;

    @ApiModelProperty(value = "speedLimit Variable of Car Class", name = "speedLimit", dataType = "Integer", example = "213")
    @Column(name = "speed_limit")
    private int speedLimit;

    @ApiModelProperty(value = "motorVehiclesTax Variable of Car Class", name = "motorVehiclesTax", dataType = "double", example = "3923.0")
    @Column(name = "motor_vehicles_tax")
    private double motorVehiclesTax;

    @ApiModelProperty(value = "engineVolume Variable of Car Class", name = "engineVolume", dataType = "Integer", example = "1995")
    @Column(name = "engine_volume")
    private int engineVolume;

    @ApiModelProperty(value = "maximumPower Variable of Car Class", name = "maximumPower", dataType = "Integer", example = "150")
    @Column(name = "maximum_power")
    private int maximumPower;

    @ApiModelProperty(value = "maximumTorque Variable of Car Class", name = "maximumTorque", dataType = "Integer", example = "320")
    @Column(name = "maximum_torque")
    private int maximumTorque;

    @ApiModelProperty(value = "urbanFuelConsumption Variable of Car Class", name = "urbanFuelConsumption", dataType = "double", example = "4.9")
    @Column(name = "urban_fuel_consumption")
    private double urbanFuelConsumption;

    @ApiModelProperty(value = "extraUrbanFuelConsumption Variable of Car Class", name = "extraUrbanFuelConsumption", dataType = "double", example = "3.6")
    @Column(name = "extra_urban_fuel_consumption")
    private double extraUrbanFuelConsumption;

    @ApiModelProperty(value = "averageFuelEfficiency Variable of Car Class", name = "averageFuelEfficiency", dataType = "double", example = "4.1")
    @Column(name = "average_fuel_efficiency")
    private double averageFuelEfficiency;

    @ApiModelProperty(value = "numberOfSeats Variable of Car Class", name = "numberOfSeats", dataType = "Integer", example = "5")
    @Column(name = "number_of_seats")
    private int numberOfSeats;

    @ApiModelProperty(value = "length Variable of Car Class", name = "length", dataType = "Integer", example = "4638")
    @Column(name = "length")
    private int length;

    @ApiModelProperty(value = "width Variable of Car Class", name = "width", dataType = "Integer", example = "1825")
    @Column(name = "width")
    private int width;

    @ApiModelProperty(value = "height Variable of Car Class", name = "height", dataType = "Integer", example = "1389")
    @Column(name = "height")
    private int height;

    @ApiModelProperty(value = "bearingCapacity Variable of Car Class", name = "bearingCapacity", dataType = "Integer", example = "560")
    @Column(name = "bearing_capacity")
    private int bearingCapacity;

    public Car() {
    }

    public Car(int carId, String carBrand, String vehicleType, String model, String color, String modelType,
               String engineType, String productYear, String fuelType, String fuelConsumption, int enginePower,
               String transmission, double speedup, int speedLimit, double motorVehiclesTax, int engineVolume,
               int maximumPower, int maximumTorque, double urbanFuelConsumption, double extraUrbanFuelConsumption,
               double averageFuelEfficiency, int numberOfSeats, int length, int width, int height, int bearingCapacity) {
        this.carId = carId;
        this.carBrand = carBrand;
        this.vehicleType = vehicleType;
        this.model = model;
        this.color = color;
        this.modelType = modelType;
        this.engineType = engineType;
        this.productYear = productYear;
        this.fuelType = fuelType;
        this.fuelConsumption = fuelConsumption;
        this.enginePower = enginePower;
        this.transmission = transmission;
        this.speedup = speedup;
        this.speedLimit = speedLimit;
        this.motorVehiclesTax = motorVehiclesTax;
        this.engineVolume = engineVolume;
        this.maximumPower = maximumPower;
        this.maximumTorque = maximumTorque;
        this.urbanFuelConsumption = urbanFuelConsumption;
        this.extraUrbanFuelConsumption = extraUrbanFuelConsumption;
        this.averageFuelEfficiency = averageFuelEfficiency;
        this.numberOfSeats = numberOfSeats;
        this.length = length;
        this.width = width;
        this.height = height;
        this.bearingCapacity = bearingCapacity;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getProductYear() {
        return productYear;
    }

    public void setProductYear(String productYear) {
        this.productYear = productYear;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(String fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public double getSpeedup() {
        return speedup;
    }

    public void setSpeedup(double speedup) {
        this.speedup = speedup;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }

    public double getMotorVehiclesTax() {
        return motorVehiclesTax;
    }

    public void setMotorVehiclesTax(double motorVehiclesTax) {
        this.motorVehiclesTax = motorVehiclesTax;
    }

    public int getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(int engineVolume) {
        this.engineVolume = engineVolume;
    }

    public int getMaximumPower() {
        return maximumPower;
    }

    public void setMaximumPower(int maximumPower) {
        this.maximumPower = maximumPower;
    }

    public int getMaximumTorque() {
        return maximumTorque;
    }

    public void setMaximumTorque(int maximumTorque) {
        this.maximumTorque = maximumTorque;
    }

    public double getUrbanFuelConsumption() {
        return urbanFuelConsumption;
    }

    public void setUrbanFuelConsumption(double urbanFuelConsumption) {
        this.urbanFuelConsumption = urbanFuelConsumption;
    }

    public double getExtraUrbanFuelConsumption() {
        return extraUrbanFuelConsumption;
    }

    public void setExtraUrbanFuelConsumption(double extraUrbanFuelConsumption) {
        this.extraUrbanFuelConsumption = extraUrbanFuelConsumption;
    }

    public double getAverageFuelEfficiency() {
        return averageFuelEfficiency;
    }

    public void setAverageFuelEfficiency(double averageFuelEfficiency) {
        this.averageFuelEfficiency = averageFuelEfficiency;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBearingCapacity() {
        return bearingCapacity;
    }

    public void setBearingCapacity(int bearingCapacity) {
        this.bearingCapacity = bearingCapacity;
    }
}

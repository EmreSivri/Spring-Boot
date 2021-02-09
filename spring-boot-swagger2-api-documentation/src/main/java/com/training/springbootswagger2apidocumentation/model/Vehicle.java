package com.training.springbootswagger2apidocumentation.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

@Entity
@Table(name = "vehicle")
@ApiModel(value = "Vehicle Class", description = "There are all variables that belong to our vehicle class.")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "Singular id Field of Vehicle Class", name = "vehicleId", dataType = "Integer", example = "1")
    private int vehicleId;

    @ApiModelProperty(value = "carBrand Variable of Vehicle Class", name = "carBrand", dataType = "String", example = "BMW")
    @Column(name = "car_brand")
    private String carBrand;

    @ApiModelProperty(value = "vehicleType Variable of Vehicle Class", name = "vehicleType", dataType = "String", example = "Binek Araç / D Segment")
    @Column(name = "vehicle_type")
    private String vehicleType;

    @ApiModelProperty(value = "modelType Variable of Vehicle Class", name = "modelType", dataType = "String", example = "Sedan / 4 Kapı")
    @Column(name = "model_type")
    private String modelType;

    @ApiModelProperty(value = "engineType Variable of Vehicle Class", name = "engineType", dataType = "String", example = "Benzinli / 4 silindir")
    @Column(name = "engine_type")
    private String engineType;

    @ApiModelProperty(value = "productYear Variable of Vehicle Class", name = "productYear", dataType = "String", example = "2019 / Üretim devam ediyor")
    @Column(name = "product_year")
    private String productYear;

    @ApiModelProperty(value = "fuelConsumption Variable of Vehicle Class", name = "fuelConsumption", dataType = "String", example = "7,6 lt / 5,1 lt")
    @Column(name = "fuel_consumption")
    private String fuelConsumption;

    @ApiModelProperty(value = "enginePower Variable of Vehicle Class", name = "enginePower", dataType = "Integer", example = "170")
    @Column(name = "engine_power")
    private int enginePower;

    @ApiModelProperty(value = "transmission Variable of Vehicle Class", name = "transmission", dataType = "String", example = "Otomatik / 8 Vites / Arkadan İtiş")
    @Column(name = "transmission")
    private String transmission;

    @ApiModelProperty(value = "speedup Variable of Vehicle Class", name = "speedup", dataType = "double", example = "7.7")
    @Column(name = "speedup")
    private double speedup;

    @ApiModelProperty(value = "speedLimit Variable of Vehicle Class", name = "speedLimit", dataType = "Integer", example = "232")
    @Column(name = "speed_limit")
    private int speedLimit;

    @ApiModelProperty(value = "motorVehiclesTax Variable of Vehicle Class", name = "motorVehiclesTax", dataType = "double", example = "1098.5")
    @Column(name = "motor_vehicles_tax")
    private double motorVehiclesTax;

    @ApiModelProperty(value = "engineVolume Variable of Vehicle Class", name = "engineVolume", dataType = "Integer", example = "1597")
    @Column(name = "engine_volume")
    private int engineVolume;

    @ApiModelProperty(value = "maximumPower Variable of Vehicle Class", name = "maximumPower", dataType = "Integer", example = "170")
    @Column(name = "maximum_power")
    private int maximumPower;

    @ApiModelProperty(value = "maximumTorque Variable of Vehicle Class", name = "maximumTorque", dataType = "Integer", example = "250")
    @Column(name = "maximum_torque")
    private int maximumTorque;

    @ApiModelProperty(value = "fuelType Variable of Vehicle Class", name = "fuelType", dataType = "String", example = "Benzinli / EURO 6.2")
    @Column(name = "fuel_type")
    private String fuelType;

    @ApiModelProperty(value = "urbanFuelConsumption Variable of Vehicle Class", name = "urbanFuelConsumption", dataType = "double", example = "7.6")
    @Column(name = "urban_fuel_consumption")
    private double urbanFuelConsumption;

    @ApiModelProperty(value = "extraUrbanFuelConsumption Variable of Vehicle Class", name = "extraUrbanFuelConsumption", dataType = "double", example = "5.1")
    @Column(name = "extra_urban_fuel_consumption")
    private double extraUrbanFuelConsumption;

    @ApiModelProperty(value = "averageFuelEfficiency Variable of Vehicle Class", name = "averageFuelEfficiency", dataType = "double", example = "6.0")
    @Column(name = "average_fuel_efficiency")
    private double averageFuelEfficiency;

    @ApiModelProperty(value = "numberOfSeats Variable of Vehicle Class", name = "numberOfSeats", dataType = "Integer", example = "5")
    @Column(name = "number_of_seats")
    private int numberOfSeats;

    @ApiModelProperty(value = "length Variable of Vehicle Class", name = "length", dataType = "Integer", example = "4709")
    @Column(name = "length")
    private int length;

    @ApiModelProperty(value = "width Variable of Vehicle Class", name = "width", dataType = "Integer", example = "1827")
    @Column(name = "width")
    private int width;

    @ApiModelProperty(value = "height Variable of Vehicle Class", name = "height", dataType = "Integer", example = "1435")
    @Column(name = "height")
    private int height;

    @ApiModelProperty(value = "bearingCapacity Variable of Vehicle Class", name = "bearingCapacity", dataType = "Integer", example = "525")
    @Column(name = "bearing_capacity")
    private int bearingCapacity;

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
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

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
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
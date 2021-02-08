package com.training.springbootpostgresqlcrud.model;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int carId;

    @Column(name = "car_brand")
    private String carBrand;

    @Column(name = "model")
    private String model;

    @Column(name = "color")
    private String color;

    @Column(name = "model_type")
    private String modelType;

    @Column(name = "product_place")
    private String productPlace;

    @Column(name = "transmission")
    private String transmission;

    @Column(name = "fuel_type")
    private String fuelType;

    @Column(name = "hp")
    private int hp;

    @Column(name = "chassis_number")
    private String chassisNumber;

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

    public String getProductPlace() {
        return productPlace;
    }

    public void setProductPlace(String productPlace) {
        this.productPlace = productPlace;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getChassisNumber() {
        return chassisNumber;
    }

    public void setChassisNumber(String chassisNumber) {
        this.chassisNumber = chassisNumber;
    }
}

package com.example.GarageWSv3.service;

import com.example.GarageWSv3.entity.Car;

import java.util.List;

public interface CarsService {
    List<Car> getAllCars();

    Car getCarById(int id);

    void insertCar(Car car);

    void updateCar(Car car);

    void deleteCar(int id);
}

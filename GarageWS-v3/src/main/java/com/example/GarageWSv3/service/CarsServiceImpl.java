package com.example.GarageWSv3.service;

import com.example.GarageWSv3.dao.CarDAO;
import com.example.GarageWSv3.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarsServiceImpl implements CarsService {
    private final CarDAO carsRepository;

    @Autowired
    public CarsServiceImpl(CarDAO carsRepository) {
        this.carsRepository = carsRepository;
    }

    @Override
    public List<Car> getAllCars() {
        return  carsRepository.findAll();
    }

    @Override
    public Car getCarById(int id) {
        return carsRepository.findById(id).orElse(null);
    }

    @Override
    public void insertCar(Car car) {
        carsRepository.save(car);

    }

    @Override
    public void updateCar(Car car) {
        carsRepository.save(car);

    }

    @Override
    public void deleteCar(int id) {
        // Check if the car exists
        Optional<Car> carOptional = carsRepository.findById(id);
        if (carOptional.isEmpty()) {
            throw new CarNotFoundException("Car with ID " + id + " not found");
        }

        // If the car exists, delete it
        carsRepository.deleteById(id);
    }

}

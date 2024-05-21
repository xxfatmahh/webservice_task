package com.example.GarageWSv3.service;

import com.example.GarageWSv3.dao.CarDAO;
import com.example.GarageWSv3.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarsServiceImpl implements CarsService {
  //  private final CarDAO carsRepository;

//    @Autowired
//    public CarsServiceImpl(CarDAO carsRepository) {
//        this.carsRepository = carsRepository;
//    }
    @Autowired
    CarDAO carsRepository;

    @Override
    public List<Car> getAllCars() {
        return carsRepository.findAll();
    }

    @Override
    public Car getCarById(int id) {
        return carsRepository.findById(id)
                .orElseThrow(() -> new CarNotFoundException("Car not found with ID " + id));
    }
    // Filter cars by name
    @Override
    public List<Car> filterCarsByName(String name) {
        return carsRepository.findAll().stream()
                .filter(t -> t.getName().equals(name))
                .collect(Collectors.toList());
    }


    @Override
    public void insertCar(Car car) {
        carsRepository.save(car);
    }

    @Override
    public void updateCar(Car car) {
        // Check if the car exists before updating
        if (carsRepository.existsById(car.getId())) {
            carsRepository.save(car);
        } else {
            throw new CarNotFoundException("Car not found with ID " + car.getId());
        }
    }

    @Override
    public void deleteCar(int id) {
        if (carsRepository.existsById(id)) {
            carsRepository.deleteById(id);
        } else {
            throw new CarNotFoundException("Car not found with ID " + id);
        }
    }
}

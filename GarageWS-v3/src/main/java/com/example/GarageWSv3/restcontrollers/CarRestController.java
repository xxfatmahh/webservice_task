package com.example.GarageWSv3.restcontrollers;

import com.example.GarageWSv3.entity.Car;
import com.example.GarageWSv3.service.CarNotFoundException;
import com.example.GarageWSv3.service.CarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarRestController {
    @Autowired
    CarsService carsService;

//    @Autowired
//    public CarRestController(CarsService carsService) {
//        this.carsService = carsService;
//    }

    @GetMapping("/Get/{id}")
    public ResponseEntity getCarById(@PathVariable int id) {
        Car car = carsService.getCarById(id);
        if (car != null) {
            return new ResponseEntity<>(car, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("Get/cars")
    public List<Car> getAllCars() {
        List<Car> cars = carsService.getAllCars();
        return cars;
    }
    @GetMapping("Get/carsByName/{name}")
    public List<Car> flterCars(@PathVariable String name) {
        List<Car> cars = carsService.filterCarsByName(name);
        return cars;
    }

    @PostMapping("post/car")
    public String addCar(@RequestBody Car car) {
        carsService.insertCar(car);
        return "Car inserted Successfully";

    }


    @PutMapping("put/car")
    public String updateCar(@RequestBody Car car) {
        carsService.updateCar(car);
        return "Car Updated Successfully ";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCar(@PathVariable int id) {

            carsService.deleteCar(id);
            return "Car deleted Successfully ";


    }
}

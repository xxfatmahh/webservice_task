package com.example.GarageWSv3.restcontrollers;

import com.example.GarageWSv3.entity.Garage;
import com.example.GarageWSv3.service.CarNotFoundException;
import com.example.GarageWSv3.service.GarageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/garage")
public class GarageRestController {
    @Autowired
     GarageService garageService;

//    public GarageRestController(GarageService garageService) {
//        this.garageService = garageService;
//    }
    @GetMapping("/Get/{id}")
    public ResponseEntity getCarById(@PathVariable int id) {
        Garage garage = garageService.getGarageById(id);
        if (garage != null) {
            return new ResponseEntity<>(garage, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("Get/garages")
    public List<Garage> getAllgarages() {
        List<Garage> garages = garageService.getAllGarages();
        return garages;
    }
    @PostMapping("post/garage")
    public String addGarage(@RequestBody Garage garage) {
        garageService.insertGarage(garage);
        return "Garage inserted Successfully";

    }
    @PutMapping("put/garage")
    public String updateGarage(@RequestBody Garage garage) {
        garageService.updateGarage(garage);
        return "Garage Updated Successfully ";
    }
    @DeleteMapping("delete/{id}")
    public String deleteGarage(@PathVariable int id) {
        try {
            garageService.deleteGarage(id);
            return "Garage deleted Successfully ";
        } catch (CarNotFoundException e) {
            return "Garage not found ";
        }
    }
}

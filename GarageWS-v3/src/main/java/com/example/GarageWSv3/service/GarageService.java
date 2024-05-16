package com.example.GarageWSv3.service;

import com.example.GarageWSv3.entity.Garage;

import java.util.List;

public interface GarageService {
    List<Garage> getAllGarages();

    Garage getGarageById(int id);

    void insertGarage(Garage garage);

    void updateGarage(Garage garage);

    void deleteGarage(int id);
}

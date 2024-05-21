package com.example.GarageWSv3.service;

import com.example.GarageWSv3.dao.GarageDAO;
import com.example.GarageWSv3.entity.Garage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GarageServiceImpl implements GarageService {
    @Autowired
    GarageDAO garageRepository;

//    public GarageServiceImpl(GarageDAO garageRepository) {
//        this.garageRepository = garageRepository;
//    }

    @Override
    public List<Garage> getAllGarages() {
        return garageRepository.findAll();
    }

    @Override
    public Garage getGarageById(int id) {
        return garageRepository.findById(id)
                .orElseThrow(() -> new GarageNotFoundException("Garage not found with id " + id));
    }

    @Override
    public void insertGarage(Garage garage) {
        garageRepository.save(garage);
    }

    @Override
    public void updateGarage(Garage garage) {
        // Check if the garage exists before updating
        if (garageRepository.existsById(garage.getId())) {
            garageRepository.save(garage);
        } else {
            throw new GarageNotFoundException("Garage not found with id " + garage.getId());
        }
    }

    @Override
    public void deleteGarage(int id) {
        if (garageRepository.existsById(id)) {
            garageRepository.deleteById(id);
        } else {
            throw new GarageNotFoundException("Garage not found with id " + id);
        }
    }
}

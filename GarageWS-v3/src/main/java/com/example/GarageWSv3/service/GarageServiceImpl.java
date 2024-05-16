package com.example.GarageWSv3.service;

import com.example.GarageWSv3.dao.GarageDAO;
import com.example.GarageWSv3.entity.Garage;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GarageServiceImpl implements GarageService{
    private final GarageDAO garageRepository;

    public GarageServiceImpl(GarageDAO garageRepository) {
        this.garageRepository = garageRepository;
    }

    @Override
    public List<Garage> getAllGarages() {
        return garageRepository.findAll();
    }

    @Override
    public Garage getGarageById(int id) {
        return garageRepository.findById(id).orElse(null);
    }

    @Override
    public void insertGarage(Garage garage) {
        garageRepository.save(garage);

    }

    @Override
    public void updateGarage(Garage garage) {
        garageRepository.save(garage);

    }

    @Override
    public void deleteGarage(int id) {
        garageRepository.deleteById(id);

    }
}

package com.example.GarageWSv3.dao;

import com.example.GarageWSv3.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CarDAO extends JpaRepository<Car, Integer> {
    // Custom query methods for CRUD operations
    List<Car> findByModel(String model);
    List<Car> findByYear(int year);
    List<Car> findByName(String name);

    Car save(Car car);

    void deleteById(int id);
}

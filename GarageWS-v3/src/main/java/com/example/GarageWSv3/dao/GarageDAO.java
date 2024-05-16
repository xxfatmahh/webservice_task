package com.example.GarageWSv3.dao;

import com.example.GarageWSv3.entity.Garage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface GarageDAO extends JpaRepository<Garage, Integer> {
    // Custom query methods for CRUD operations
    List<Garage> findByNumberOfFloors(int numberOfFloors);
    List<Garage> findByWatcher(String watcher);
    List<Garage> findByName(String name);

    Garage save(Garage garage);

    void deleteById(int id);

}

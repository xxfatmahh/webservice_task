package com.example.GarageWSv3.dao;

import com.example.GarageWSv3.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CarDAO extends JpaRepository<Car, Integer> {
}

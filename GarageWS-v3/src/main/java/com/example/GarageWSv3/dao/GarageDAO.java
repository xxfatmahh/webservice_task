package com.example.GarageWSv3.dao;

import com.example.GarageWSv3.entity.Garage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface GarageDAO extends JpaRepository<Garage, Integer> {

}

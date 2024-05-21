package com.example.GarageWSv3.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="garage")
public class Garage {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;
     @Column(name="max_number_of_cars")
    private int maxNumberOfCars;
     @Column(name="current_number_of_cars")
    private int currentNumOfCars;
     @Column(name="number_of_floors")
    private int numberOfFloors;
     @Column(name="watcher")
    private String watcher;
}

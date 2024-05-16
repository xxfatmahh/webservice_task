package com.example.GarageWSv3.entity;

import jakarta.persistence.*;

@Entity
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

    public Garage( String name, int maxNumberOfCars, int currentNumOfCars, int numberOfFloors, String watcher) {
        this.name = name;
        this.maxNumberOfCars = maxNumberOfCars;
        this.currentNumOfCars = currentNumOfCars;
        this.numberOfFloors = numberOfFloors;
        this.watcher = watcher;
    }
    public Garage(){}

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMaxNumberOfCars() {
        return maxNumberOfCars;
    }

    public int getCurrentNumOfCars() {
        return currentNumOfCars;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public String getWatcher() {
        return watcher;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxNumberOfCars(int maxNumberOfCars) {
        this.maxNumberOfCars = maxNumberOfCars;
    }

    public void setCurrentNumOfCars(int currentNumOfCars) {
        this.currentNumOfCars = currentNumOfCars;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public void setWatcher(String watcher) {
        this.watcher = watcher;
    }
    @Override
    public String toString() {
        return "Garage [garage_id=" + id + ", name=" + name + ", capacity=" + maxNumberOfCars + ", currentNumOfCars="
                + currentNumOfCars + ", numberOfFloors=" + numberOfFloors + ", watcher=" + watcher + "]";
    }

}

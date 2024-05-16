package com.example.GarageWSv3.entity;

import jakarta.persistence.*;

@Entity
@Table(name="cars")
public class Car {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="model")
    private String model;

    @Column(name="year")
    private int year;

    public Car( String name, String model, int year) {

        this.name = name;
        this.model = model;
        this.year = year;
    }
    public Car(){};

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }
    @Override
    public String toString() {
        return "Cars [car_id=" + id + ", name=" + name + ", model=" + model + ", year=" + year + "]";
    }
}

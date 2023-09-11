package com.ba.boost.openclosed.example;

public abstract class Vehicle {

    private String brand;
    private int model;


    public Vehicle(String brand, int model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model=" + model +
                '}';
    }
}

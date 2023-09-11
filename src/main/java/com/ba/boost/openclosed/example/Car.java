package com.ba.boost.openclosed.example;

public class Car extends Vehicle{

    private boolean hasCooling;

    public Car(String brand, int model, boolean hasCooling) {
        super(brand, model);
        this.hasCooling = hasCooling;
    }

    @Override
    public String toString() {
        return "Car{" +
                "hasCooling=" + hasCooling +
                "} " + super.toString();
    }
}

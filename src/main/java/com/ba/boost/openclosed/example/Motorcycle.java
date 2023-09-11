package com.ba.boost.openclosed.example;

public class Motorcycle extends Vehicle{

    private boolean hasSidecar;

    public Motorcycle(String brand, int model, boolean hasSidecar) {
        super(brand, model);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "hasSidecar=" + hasSidecar +
                "} " + super.toString();
    }
}

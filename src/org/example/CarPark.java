package org.example;

import java.util.ArrayList;
import java.util.List;

public class CarPark {

    private final List<Vehicle> vehiclesParked = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        this.vehiclesParked.add(vehicle);
    }

    public void listVehicles() {
        for (Vehicle vehicle : vehiclesParked) {
            System.out.println(vehicle);
        }
    }



}

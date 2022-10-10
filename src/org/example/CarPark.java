package org.example;

import java.util.ArrayList;
import java.util.List;

public class CarPark {

    private final List<Vehicle> vehiclesParked = new ArrayList<>();
    private final int totalSpaces = 100;
    private int availableSpaces = totalSpaces;
    private int motorbikeSpots = 50;


    public void addVehicle(Vehicle vehicle) {
        this.vehiclesParked.add(vehicle);
        if(vehicle.getVehicleType() == VehicleType.motorbike) {
            motorbikeSpots--;
        } else {
            availableSpaces -= vehicle.getVehicleSize();
        }
    }

    public void listVehicles() {
        for (Vehicle vehicle : vehiclesParked) {
            System.out.println(vehicle);
        }
    }

    public int getTotalSpots() {
        return totalSpaces;
    }

    public int getAvailableSpaces() {
        return availableSpaces;
    }

    public int getAvailableVanSpaces() {
        return availableSpaces / 3;
    }

    public int getAvailableMotorbikeSpots() {
        return motorbikeSpots;
    }





}

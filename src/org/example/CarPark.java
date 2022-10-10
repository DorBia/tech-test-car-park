package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.example.VehicleType.*;

public class CarPark {

    private final List<Vehicle> vehiclesParked = new ArrayList<>();
    private int availableSpaces;
    private int motorbikeSpots;


    public CarPark(int availableSpaces, int motorbikeSpots) {
        this.availableSpaces = availableSpaces;
        this.motorbikeSpots = motorbikeSpots;
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

    public void addVehicle(Vehicle vehicle) {

        boolean hasMotorbikeSpots = motorbikeSpots > 0;
        boolean hasAvailableSpaces = availableSpaces > 0;

        if(vehicle.getVehicleType() == VehicleType.motorbike && hasMotorbikeSpots) {
            motorbikeSpots--;
            this.vehiclesParked.add(vehicle);
        } else if (hasAvailableSpaces){
            availableSpaces -= vehicle.getVehicleSize();
            this.vehiclesParked.add(vehicle);
        }

    }

    public void listVehicles() {
        for (Vehicle vehicle : vehiclesParked) {
            System.out.println(vehicle);
        }
    }

}

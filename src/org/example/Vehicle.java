package org.example;

public abstract class Vehicle {
    private final String regPlate;
    private final VehicleType vehicleType;
    private final int vehicleSize;

    public Vehicle(String regPlate, VehicleType vehicleType, int vehicleSize) {
        this.regPlate = regPlate;
        this.vehicleType = vehicleType;
        this.vehicleSize = vehicleSize;
    }

    public String getLicensePlate() {
        return regPlate;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public int getVehicleSize() {
        return vehicleSize;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "regPlate='" + regPlate + '\'' +
                ", type='" + vehicleType + '\'' +
                '}';
    }
}

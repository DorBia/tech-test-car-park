package org.example;

public class VehicleFactory {
    public static Vehicle createVehicle(VehicleType vehicleType) {
        switch (vehicleType) {
            case car:
                return new Car();
            case van:
                return new Van();
            case motorbike:
                return new Motorbike();
        }
        throw new IllegalArgumentException("This vehicle type can't be created " + vehicleType);
    }
}

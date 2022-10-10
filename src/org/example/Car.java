package org.example;

import static org.example.VehicleType.car;

public class Car extends Vehicle {

    public Car() {
        super(RegPlateUtils.generateRegPlate(), car, 1);
    }
}

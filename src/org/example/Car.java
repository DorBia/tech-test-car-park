package org.example;

public class Car extends Vehicle {

    public Car() {
        super(RegPlateUtils.generateRegPlate(), "car", 1);
    }
}

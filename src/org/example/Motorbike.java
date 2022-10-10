package org.example;

public class Motorbike extends Vehicle{

    public Motorbike() {
        super(RegPlateUtils.generateRegPlate(), "motorbike", 1);
    }
}

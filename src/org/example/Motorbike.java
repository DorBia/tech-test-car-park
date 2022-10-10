package org.example;

import static org.example.VehicleType.motorbike;

public class Motorbike extends Vehicle{

    public Motorbike() {
        super(RegPlateUtils.generateRegPlate(), motorbike, 1);
    }
}

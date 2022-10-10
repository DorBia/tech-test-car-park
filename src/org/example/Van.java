package org.example;

import static org.example.VehicleType.van;

public class Van extends Vehicle{

    public Van() {
        super(RegPlateUtils.generateRegPlate(), van, 3);
    }
}

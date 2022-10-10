package org.example;

public class Van extends Vehicle{

    public Van() {
        super(RegPlateUtils.generateRegPlate(), "van", 3);
    }
}

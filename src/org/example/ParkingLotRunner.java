package org.example;

public class ParkingLotRunner {

    public static void main(String[] args) {

        CarPark carPark = new CarPark(100, 5);
        Display.displayGreeting(carPark);
        CarParkUtils.populateParking(carPark);
        Controller.manageParking(carPark);
    }
}

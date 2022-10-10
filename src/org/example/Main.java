package org.example;

import java.util.Random;

import static org.example.VehicleType.*;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        CarPark carPark = new CarPark();

        for (int i = 0; i < random.nextInt(15) + 1; i++) {
            switch (random.nextInt(3)) {
                case 0:
                    carPark.addVehicle(VehicleFactory.createVehicle(car));
                    break;
                case 1:
                    carPark.addVehicle(VehicleFactory.createVehicle(van));
                    break;
                case 2:
                    carPark.addVehicle(VehicleFactory.createVehicle(motorbike));
                    break;
            }
        }

        carPark.listVehicles();
    }
}

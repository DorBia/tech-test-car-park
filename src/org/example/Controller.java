package org.example;

import java.util.Scanner;

import static org.example.VehicleType.*;

public class Controller {

    public static void manageParking(CarPark carPark) {
        boolean isActive = true;
        Display.displayCommands();

        while(isActive){

            Scanner scanner = new Scanner(System.in);
            String option = scanner.next();

            switch (option) {
                case "0":
                    Display.displayCommands();
                    break;
                case "1":
                    if (carPark.getAvailableSpaces() > 0) {
                        carPark.addVehicle(VehicleFactory.createVehicle(car));
                        System.out.println("Car parked.");
                    } else {
                        System.out.println("We don't have spaces for cars anymore. Sorry.");
                    }
                    break;
                case "2":
                    if (carPark.getAvailableVanSpaces() > 0) {
                        carPark.addVehicle(VehicleFactory.createVehicle(van));
                        System.out.println("Van parked.");
                    } else {
                        System.out.println("We don't have spaces for vans anymore. Sorry.");
                    }
                    break;
                case "3":
                    if (carPark.getAvailableMotorbikeSpots() > 0) {
                        carPark.addVehicle(VehicleFactory.createVehicle(motorbike));
                        System.out.println("Motorbike parked.");
                    } else {
                        System.out.println("We don't have spaces for bikes anymore. Sorry.");
                    }
                    break;
                case "4":
                    System.out.println("Available single spaces: " + carPark.getAvailableSpaces());
                    System.out.println("Available van spaces: " + carPark.getAvailableVanSpaces());
                    System.out.println("Available motorbike spaces: " + carPark.getAvailableMotorbikeSpots());
                    break;
                case "5":
                    carPark.listVehicles();
                    break;
                default:
                    isActive = false;
        }
            Display.displayRemainder();
            System.out.println("Choose an option.");
            System.out.println();


        }
    }
}


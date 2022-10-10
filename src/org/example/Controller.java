package org.example;

import java.util.Scanner;

import static org.example.VehicleType.*;

public class Controller {

    public static void displayGreeting() {
        System.out.println("Welcome to our amazing parking.");
        System.out.println("We have a few commands you can run.");
    }

    public static void displayCommands() {
        System.out.println("Press 1 to park a car.");
        System.out.println("Press 2 to park a van.");
        System.out.println("Press 3 to park a motorbike.");
        System.out.println("Press 4 to see how many spots there are in total.");
        System.out.println("Press 5 to list all vehicles parked.");
        System.out.println("Press anything to exit.");
    }

    public static void displayRemainder() {
        System.out.println("To print commands press 0.");
    }

    public static void manageParking(CarPark carPark) {
        boolean isActive = true;
        displayCommands();

        while(isActive){

            Scanner scanner = new Scanner(System.in);
            String option = scanner.next();

            switch (option) {
                case "0":
                    displayCommands();
                case "1":
                    carPark.addVehicle(VehicleFactory.createVehicle(car));
                    System.out.println("Car parked.");
                    break;
                case "2":
                    carPark.addVehicle(VehicleFactory.createVehicle(van));
                    System.out.println("Van parked.");
                    break;
                case "3":
                    carPark.addVehicle(VehicleFactory.createVehicle(motorbike));
                    System.out.println("Motorbike parked.");
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
            displayRemainder();


        }
    }
}


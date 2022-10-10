package org.example;

public class Display {
    public static void displayGreeting(CarPark carPark) {
        System.out.println("------------------------------------------------------------");
        System.out.println("Welcome to our amazing parking.");
        System.out.println("We have a few commands you can run.");
        System.out.println("Our car park is designed to fit: " + carPark.getAvailableSpaces() + " cars and " + carPark.getAvailableMotorbikeSpots() + " motorbikes.");
        System.out.println("------------------------------------------------------------");
    }

    public static void displayCommands() {
        System.out.println();
        System.out.println("Press 1 to park a car.");
        System.out.println("Press 2 to park a van.");
        System.out.println("Press 3 to park a motorbike.");
        System.out.println("Press 4 to see how many spots there are in total.");
        System.out.println("Press 5 to list all vehicles parked.");
        System.out.println("Press anything to exit.");
        System.out.println();
    }

    public static void displayRemainder() {
        System.out.println();
        System.out.println("To print commands press 0.");
        System.out.println();
    }
}

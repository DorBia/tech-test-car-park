package org.example;

public abstract class RegPlateUtils {

    public static String generateRegPlate() {
        int letter1 = 'A' + (int)(Math.random() * ('Z' - 'A'));
        int letter2 = 'A' + (int)(Math.random() * ('Z' - 'A'));
        int letter3 = 'A' + (int)(Math.random() * ('Z' - 'A'));
        int letter4 = 'A' + (int)(Math.random() * ('Z' - 'A'));
        int letter5 = 'A' + (int)(Math.random() * ('Z' - 'A'));

        int digit1 = (int)(Math.random() * 10);
        int digit2 = (int)(Math.random() * 10);
        return "" + (char)(letter1) + (char)(letter2) + digit1 + digit2 + " " + (char)(letter3) + (char)(letter4) + (char)(letter5);
    }
}

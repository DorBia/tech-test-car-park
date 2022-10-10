package org.example;

import java.util.Random;

public abstract class RegPlateUtils {

    static Random random = new Random();

    public static String generateRegPlate() {
        char letter1 = (char)('A' + random.nextInt(26));
        char letter2 = (char)('A' + random.nextInt(26));
        char letter3 = (char)('A' + random.nextInt(26));
        char letter4 = (char)('A' + random.nextInt(26));
        char letter5 = (char)('A' + random.nextInt(26));

        int digit1 = random.nextInt(10);
        int digit2 = random.nextInt(10);

        return "" + letter1 + letter2 + digit1 + digit2 + " " + letter3 + letter4 + letter5;
    }
}

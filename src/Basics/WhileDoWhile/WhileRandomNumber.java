package Basics.WhileDoWhile;

import java.util.Random;

public class WhileRandomNumber {
    public static void main(String[] args) {
        Random generator = new Random();

        int counter = 0;
        int x = 100;

        do {
            int randomValue = generator.nextInt(5);
            x -= randomValue;
            counter++;
        } while(x > 0);
        System.out.println("Count " + counter);
    }
}

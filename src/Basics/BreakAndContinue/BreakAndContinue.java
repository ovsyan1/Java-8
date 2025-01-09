package Basics.BreakAndContinue;

public class BreakAndContinue {
    static void b1 () {
        int counter = 0;
        double randomValue;


        do{
            randomValue = Math.random();
            counter++;
        } while(randomValue <= 0.1 || randomValue >= 0.2);
        System.out.println(counter);
    }

    public static void main(String[] args) {
        b1();
        System.out.println();

    }
}

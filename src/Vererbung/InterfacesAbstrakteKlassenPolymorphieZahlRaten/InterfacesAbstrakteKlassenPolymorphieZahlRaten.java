package Vererbung.InterfacesAbstrakteKlassenPolymorphieZahlRaten;

import java.util.Random;

public class InterfacesAbstrakteKlassenPolymorphieZahlRaten {
    public static void main(String[] args) {
        int x = new Random().nextInt(10) + 1;

        System.out.println("x: " + x);

        IntOperation op1 = new Multiply(2);
        int result1 = op1.execute(x); // result1 ist 2 * x

        System.out.println("result1: " + result1);

        IntOperation op2 = new Multiply(5);
        int result2 = op2.execute(result1);

        System.out.println("result2: " + result2);

        IntOperation op3 = new Divide(x);
        int result3 = op3.execute(result2);

        System.out.println("result3: " + result3);

        IntOperation op4 = new Subtract(7);
        int result4 = op4.execute(result3);

        System.out.println("result4: " + result4);

        IntOperation[] ops = {
                new Add(5), // addiert 5
                new ChangeSign(), // ändert das Vorzeichen
                new Multiply(2), // mit 2 multiplizieren
                new Subtract(3)  // 3 subtrahieren
        };

        int mainResult = 2;

        for (IntOperation value : ops) {
            mainResult = value.execute(mainResult);
        }

        System.out.println("Main result: " + mainResult);

        IntOperation op = new Add(5)
                .andThen(new ChangeSign())
                .andThen(new Multiply(2))
                .andThen(new Subtract(3));

        int result = op.execute(2); // result ist -17

        System.out.println("Fatory result: " + result);
    }
}

package JavaAPI.printf;

import java.util.Random;

class Test {
    public static void main(String[] args) {
        Figur[] figur = new Figur[10];

        Random rnd = new Random();

        String str = "|%3s.|%-15s|%-10s|%n";

        System.out.format(str, "Nr", "Typ", "Fläche");

        for (int i = 0; i < figur.length; i++) {
            if (rnd.nextBoolean()) {
                figur[i] = new Rechteck(rnd.nextInt(20) + 1, rnd.nextInt(20) + 1);
            } else {
                figur[i] = new Kreis(rnd.nextInt(20) + 1);
            }

            System.out.format(str, i + 1, figur[i].getClass().getSimpleName(), figur[i].getFläche());
        }
    }
}

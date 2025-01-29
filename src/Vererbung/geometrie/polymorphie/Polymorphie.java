package Vererbung.geometrie.polymorphie;

import java.util.Random;

public class Polymorphie {
    public static void main(String[] args) {
        Rechteck rechteck = new Rechteck(3, 4);
        Kreis kreis = new Kreis(10);

        System.out.println(rechteck + "  und es ist meine Fläche: " + rechteck.getFlaeche(rechteck));
        System.out.println(kreis + " und es ist meine Fläche: " + kreis.getFlaeche(kreis));

        System.out.println("\n*****");

        Polymorphie p = new Polymorphie();

        Figur [] arr = p.setRandomArray(5);

        getFlaeche(arr);
    }

    static void getFlaeche(Figur[] arr) {
        for(Figur f : arr) {
            System.out.println(f + " meine Fläche ist: " + f.getFlaeche(f));
        }
    }

    Figur[] setRandomArray(int len) {
        Figur [] array = new Figur[len];

        for(int i = 0; i < array.length; i++) {
            Random rnd = new Random();

            if(rnd.nextBoolean()) {
                array[i] = new Rechteck(rnd.nextInt(21), rnd.nextInt(21));
            } else {
                array[i] = new Kreis(rnd.nextInt(21));
            }


        }

        return array;
    }
}

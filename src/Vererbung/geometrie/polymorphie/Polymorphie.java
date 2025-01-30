package Vererbung.geometrie.polymorphie;

import java.util.Random;

public class Polymorphie {
    public static void main(String[] args) {
        Rechteck rechteck = new Rechteck(3, 4);
        Kreis kreis = new Kreis(10);

        System.out.println(rechteck + "  und das ist meine Fläche: " + rechteck.getFlaeche());
        System.out.println(kreis + " und das ist meine Fläche: " + kreis.getFlaeche());

        System.out.println("\n*****");

        Polymorphie p = new Polymorphie();

        Figur [] arr = p.setRandomArray(5);

        getFlaecheFromRndArr(arr);
    }

    static void getFlaecheFromRndArr(Figur[] arr) {
        for(Figur f : arr) {
            System.out.println(f + " meine Fläche ist: " + f.getFlaeche());
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

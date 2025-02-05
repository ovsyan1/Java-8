package Vererbung.sortierung.ObjectSort;

import java.util.Arrays;
import java.util.Random;

class ObjectSort {
    public static void main(String[] args) {
        Random rnd = new Random();

        Rechteck[] reckteckArr = {
                new Rechteck(rnd.nextInt(20) + 1,
                        rnd.nextInt(20) + 1), new Rechteck(rnd.nextInt(20) + 1,
                rnd.nextInt(20) + 1), new Rechteck(rnd.nextInt(20) + 1,
                rnd.nextInt(20) + 1), new Rechteck(rnd.nextInt(20) + 1,
                rnd.nextInt(20) + 1), new Rechteck(rnd.nextInt(20) + 1,
                rnd.nextInt(20) + 1)
        };

        System.out.println(Arrays.toString(reckteckArr));

        Arrays.sort(reckteckArr);

        System.out.println(Arrays.toString(reckteckArr));
    }
}

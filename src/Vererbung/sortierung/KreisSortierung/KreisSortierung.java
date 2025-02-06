package Vererbung.sortierung.KreisSortierung;

import java.util.Arrays;
import java.util.Comparator;

public class KreisSortierung {
    public static void main(String[] args) {
        Kreis kreis = new Kreis(5);

        Kreis[] kreisArr = {new Kreis(12), new Kreis(31), new Kreis(13), new Kreis(14), new Kreis(15)};

        System.out.println(Arrays.toString(kreisArr));

        Arrays.sort(kreisArr);

        System.out.println(Arrays.toString(kreisArr));

        Arrays.sort(kreisArr, (k1, k2) -> k2.getFläche() - k1.getFläche());
        //Comparator cmp1 = new MyKreisReverseComperator();

        //Arrays.sort(kreisArr, cmp1);

        System.out.println(Arrays.toString(kreisArr));
    }
}

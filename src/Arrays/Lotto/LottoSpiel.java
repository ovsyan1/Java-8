package Arrays.Lotto;

import java.util.Arrays;
import java.util.Random;

public class LottoSpiel {
    private int anzahlKugel;
    private int anzahlKugelGesamt;

    LottoSpiel(int anzahlKugel, int anzahlKugelGesamt) {
        this.anzahlKugel = anzahlKugel;
        this.anzahlKugelGesamt = anzahlKugelGesamt;
    }

    @Override
    public String toString() {
        return "Spiel " + this.anzahlKugel + " aus " + this.anzahlKugelGesamt + ". " + Arrays.toString(ziehen());
    }

    int[] ziehen() {
        int[] arr = new int[this.anzahlKugel];
        Random rnd = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(this.anzahlKugelGesamt) + 1;
        }

        Arrays.sort(arr);

        return arr;
    }

    public int vergleichen(Object tipp) {
        int gewinn = 0;
        LottoTipp l = (LottoTipp) tipp;

        for(int i : l.abgeben()) {
            for(int j : ziehen()) {
                if(i == j) {
                    gewinn++;
                }
            }
        }

        return gewinn;
    }
}

package Arrays.Lotto;

import java.util.Arrays;
import java.util.Random;

public class LottoSpiel {
    private int anzahlKugel;
    private int anzahlKugelGesamt;
    int[] arr;

    LottoSpiel(int anzahlKugel, int anzahlKugelGesamt) {
        this.anzahlKugel = anzahlKugel;
        this.anzahlKugelGesamt = anzahlKugelGesamt;
    }

    @Override
    public String toString() {
        return "Spiel " + this.anzahlKugel + " aus " + this.anzahlKugelGesamt + ". " + Arrays.toString(arr);
    }

    void ziehen() {
        int[] localArr = new int[this.anzahlKugel];
        Random rnd = new Random();

        for (int i = 0; i < localArr.length; i++) {
            localArr[i] = rnd.nextInt(this.anzahlKugelGesamt) + 1;
        }

        Arrays.sort(localArr);

        arr = localArr;
    }

    public int vergleichen(LottoTipp tipp) {
        int gewinn = 0;

        for(int i : arr) {
            for(int j : tipp.arr) {
                if(i == j) {
                    gewinn++;
                }
            }
        }

        return gewinn;
    }
}

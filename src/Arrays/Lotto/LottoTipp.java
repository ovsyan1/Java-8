package Arrays.Lotto;

import java.util.Arrays;
import java.util.Random;

public class LottoTipp {
    private int anzahlKugel;
    private int anzahlKugelGesamt;
    int[] arr;

    LottoTipp(int anzahlKugel, int anzahlKugelGesamt) {
        this.anzahlKugel = anzahlKugel;
        this.anzahlKugelGesamt = anzahlKugelGesamt;
    }

    @Override
    public String toString() {
        return "Tipp " + this.anzahlKugel + " aus " + this.anzahlKugelGesamt + ". " + Arrays.toString(arr);
    }

    void abgeben() {
        int[] localArr = new int[this.anzahlKugel];
        Random rnd = new Random();

        for (int i = 0; i < localArr.length; i++) {
            localArr[i] = rnd.nextInt(this.anzahlKugelGesamt) + 1;
        }

        Arrays.sort(localArr);

        arr = localArr;
    }
}

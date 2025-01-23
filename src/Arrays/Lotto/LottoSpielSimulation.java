package Arrays.Lotto;

import java.util.SimpleTimeZone;

public class LottoSpielSimulation {
    public static void main(String[] args) {
        int anzahlKugel = 7;
        int anzahlKugelGesamt = 49;
        final int EURO_GUTHABEN = 100;
        int gewinnAnzahl = 0;
        int gesamtGewinn = 0;

        LottoSpiel lotto = new LottoSpiel(anzahlKugel, anzahlKugelGesamt);

        System.out.println(lotto);

        LottoTipp tipp = new LottoTipp(anzahlKugel, anzahlKugelGesamt);
        System.out.println(tipp);

        int gewinn = lotto.vergleichen(tipp);
        System.out.println(gewinn);

        System.out.println(checkWin(gewinn));

        System.out.println();

        for (int i = EURO_GUTHABEN; i > 0; i--) {
            int localGewinn = lotto.vergleichen(tipp);
            if (localGewinn > 0) {
                gewinnAnzahl++;
                gesamtGewinn += (((int) Math.pow(10, localGewinn)) / 10);
            }
        }

        System.out.println("Gewinn anzahl: " + gewinnAnzahl);
        System.out.println("Gesamt Gewinn: " + gesamtGewinn + " Euro");
    }

    static String checkWin(int numberOfCoincidences) {
        if (numberOfCoincidences == 0 || numberOfCoincidences == 1) {
            return numberOfCoincidences + " richtige: " + numberOfCoincidences + " Euro";
        }

        return numberOfCoincidences + " richtige: " + ((int) Math.pow(10, numberOfCoincidences)) / 10 + " Euro";
    }
}

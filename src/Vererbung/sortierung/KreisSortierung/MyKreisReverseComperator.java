package Vererbung.sortierung.KreisSortierung;

import java.util.Comparator;

class MyKreisReverseComperator implements Comparator<Kreis> {
    @Override
    public int compare(Kreis k1, Kreis k2) {
        return k2.getFläche() - k1.getFläche();
    }
}

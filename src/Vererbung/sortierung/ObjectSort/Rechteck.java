package Vererbung.sortierung.ObjectSort;

class Rechteck implements Comparable<Rechteck> {
    private int breite;
    private int hoehe;

    Rechteck(int breite, int hoehe) {
        this.breite = breite;
        this.hoehe = hoehe;
    }

    int getFläche() {
        return this.breite * this.hoehe;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " Fläche: " + getFläche()  + " Breite: " + this.breite + " Hoehe: " + this.hoehe + "\n";
    }

    public int compareTo(Rechteck r) {
        int result = getFläche() - r.getFläche();

        if(result == 0) {
            result = this.breite - r.breite;
            if(result == 0) {
                result = this.hoehe - r.hoehe;
            }
        }

        return result;
    }

}

package Vererbung.geometrie.polymorphie;

class Rechteck extends Figur {
    private int breite;
    private int hoehe;

    Rechteck(int breite, int hoehe) {
        this.breite = breite;       
        this.hoehe = hoehe;
    }

    int getBreite() {
        return this.breite;
    }

    int getHoehe() {
        return this.hoehe;
    }

    int getFlaeche() {
        return this.breite * this.hoehe;
    }
}

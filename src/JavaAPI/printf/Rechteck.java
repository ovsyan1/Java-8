package JavaAPI.printf;

class Rechteck extends Figur {
    private int breite;
    private int hoehe;

    Rechteck(int breite, int hoehe) {
        this.breite = breite;
        this.hoehe = hoehe;
    }

    public int getBreite() {
        return breite;
    }

    public int getHoehe() {
        return hoehe;
    }

    int getFläche() {
     return this.breite * this.hoehe;
    }


}

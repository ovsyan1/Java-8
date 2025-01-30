package Vererbung.geometrie.polymorphie;

class Figur {
    private int x;
    private int y;

    void bewegen(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    int getFlaeche() {
    //int getFlaeche(Figur f) {
        // if (f instanceof Rechteck r) // kann auch so sein
        // if (f instanceof Rechteck) {
        //   Rechteck r = (Rechteck) f;
        //
        //  return r.getBreite() * r.getHoehe();
        //  return ((Rechteck)f).getBreite() * ((Rechteck)f).getHoehe(); // kann auch so sein
        // }

        //  if (f instanceof Kreis) {
        //    Kreis k = (Kreis) f;
        //
        //    return (int) (2 * k.getRadius() * Math.PI);
        // }

        return 0;
    }

    public String toString() {
        return "Ich heiße (" + getClass().getName() + ")";
    }
}

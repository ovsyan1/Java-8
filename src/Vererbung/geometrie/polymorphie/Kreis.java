package Vererbung.geometrie.polymorphie;

class Kreis extends Figur {
    private int radius;

    Kreis(int radius) {
        this.radius = radius;
    }

    int getRadius() {
        return this.radius;
    }

    int getFlaeche() {
        return (int) (2 * this.radius * Math.PI);
    }
}

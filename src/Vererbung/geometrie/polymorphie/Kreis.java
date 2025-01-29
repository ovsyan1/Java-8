package Vererbung.geometrie.polymorphie;

class Kreis extends Figur {
    private int radius;

    Kreis(int radius) {
        this.radius = radius;
    }

    int getRadius() {
        return this.radius;
    }
}

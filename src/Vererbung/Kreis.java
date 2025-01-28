package Vererbung;

class Kreis extends Figur {
    private int radius;

    Kreis(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Klasse Name: " + getClass().getName() + " Radius: " + this.radius;
    }
}

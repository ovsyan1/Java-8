package Vererbung.geometrie.interfacesGetMaxAufgabe;

class Kreis implements Comparable<Kreis> {
    private int radius;

    Kreis(int radius) {
        this.radius = radius;
    }

    int getRadius () {
        return this.radius;
    }

    public int compareTo(Kreis k2) {
        return radius - k2.radius;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ". R = " + this.radius;
    }
}

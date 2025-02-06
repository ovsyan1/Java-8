package Vererbung.sortierung.KreisSortierung;

class Kreis implements Comparable<Kreis> {
    private int radius;

    Kreis(int radius) {
        this.radius = radius;
    }

    int getFläche() {
        return (int)(radius * radius * Math.PI);
    }

    public int compareTo(Kreis kreis) {
        return this.getFläche() - kreis.getFläche();

    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "Fläche: " + getFläche();
    }
}

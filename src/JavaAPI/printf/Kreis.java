package JavaAPI.printf;

class Kreis implements Figur {
    private int radius;
    Kreis(int radius) {
        this.radius = radius;
    }

    int getRadius() {
        return this.radius;
    }

    public int getFläche() {
        return (int)(this.radius * 2 * Math.PI);
    }

}

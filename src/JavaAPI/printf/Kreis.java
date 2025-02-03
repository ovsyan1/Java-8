package JavaAPI.printf;

class Kreis extends Figur {
    private int radius;
    Kreis(int radius) {
        this.radius = radius;
    }

    int getRadius() {
        return this.radius;
    }

    int getFläche() {
        return (int)(this.radius * 2 * Math.PI);
    }

}

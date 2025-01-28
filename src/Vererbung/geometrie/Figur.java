package Vererbung.geometrie;

class Figur {
    private int xCoordinate;
    private int yCoordinate;

    void bewegen(int x, int y) {
        this.xCoordinate = x;
        this.yCoordinate = y;
    }

    int getXCoordinate() {
        return this.xCoordinate;
    }

    int getYCoordinate() {
        return this.yCoordinate;
    }

    String getCoordinates() {
        return "X: " + this.getXCoordinate() + " Y: " + this.getYCoordinate();
    }

//    @Override
//    public String toString() {
//        return "X: " + this.getXCoordinate() + " Y: " + this.getYCoordinate();
//    }
}

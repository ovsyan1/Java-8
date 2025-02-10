package Vererbung.InterfacesAbstrakteKlassenPolymorphieZahlRaten;

class Subtract implements IntOperation {
    private int value;

    Subtract(int value) {
        this.value = value;
    }

    public int execute(int value) {
        return value - this.value;
    }
}

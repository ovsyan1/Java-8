package Vererbung.InterfacesAbstrakteKlassenPolymorphieZahlRaten;

class Multiply implements IntOperation {
    private int value;

    Multiply(int value) {
        this.value = value;
    }

    public int execute(int value) {
        return this.value * value;
    }

}

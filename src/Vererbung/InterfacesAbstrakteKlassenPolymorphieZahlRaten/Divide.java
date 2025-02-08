package Vererbung.InterfacesAbstrakteKlassenPolymorphieZahlRaten;

class Divide implements IntOperation {
    private int value;

    Divide(int value) {
        this.value = value;
    }

    public int execute(int value) {
        return value / this.value;
    }

}

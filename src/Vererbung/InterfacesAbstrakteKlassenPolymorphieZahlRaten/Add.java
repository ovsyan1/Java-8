package Vererbung.InterfacesAbstrakteKlassenPolymorphieZahlRaten;

class Add implements IntOperation {
    private int value;

    Add(int value) {
        this.value = value;
    }

    public int execute(int value) {
        return this.value + value;
    }
}

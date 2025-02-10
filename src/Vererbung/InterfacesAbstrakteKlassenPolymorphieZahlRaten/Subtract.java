package Vererbung.InterfacesAbstrakteKlassenPolymorphieZahlRaten;

class Subtract extends AbstractIntOperation implements IntOperation {
    Subtract(int value) {
        super(value);
    }

    @Override
    public int execute(int value) {
        return value - this.value;
    }
}

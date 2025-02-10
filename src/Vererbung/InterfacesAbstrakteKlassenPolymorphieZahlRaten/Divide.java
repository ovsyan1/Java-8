package Vererbung.InterfacesAbstrakteKlassenPolymorphieZahlRaten;

class Divide extends AbstractIntOperation implements IntOperation {
    Divide(int value) {
        super(value);
    }

    @Override
    public int execute(int value) {
        return value / this.value;
    }
}

package Vererbung.InterfacesAbstrakteKlassenPolymorphieZahlRaten;

class Multiply extends AbstractIntOperation implements IntOperation {
    Multiply(int value) {
        super(value);
    }

    @Override
    public int execute(int value) {
        return this.value * value;
    }
}

package Vererbung.InterfacesAbstrakteKlassenPolymorphieZahlRaten;

class Add extends AbstractIntOperation implements IntOperation {
    Add(int value) {
        super(value);
    }

    @Override
    public int execute(int value) {
        return this.value + value;
    }
}

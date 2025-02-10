package Vererbung.InterfacesAbstrakteKlassenPolymorphieZahlRaten;

public abstract class AbstractIntOperation implements IntOperation {
    public int value;

    AbstractIntOperation(int value) {
        this.value = value;
    }
}

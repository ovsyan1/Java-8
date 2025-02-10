package Vererbung.InterfacesAbstrakteKlassenPolymorphieZahlRaten;

class ChangeSign implements IntOperation {
    @Override
    public int execute(int value) {
        return value * -1;
    }}

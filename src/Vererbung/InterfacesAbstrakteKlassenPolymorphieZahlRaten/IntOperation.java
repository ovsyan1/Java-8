package Vererbung.InterfacesAbstrakteKlassenPolymorphieZahlRaten;

interface IntOperation {
    int execute(int value);
    default IntOperation andThen(IntOperation nextOp) {
        return new CombinedIntOperation(this,nextOp);
    };
}

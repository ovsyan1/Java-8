package Vererbung.geometrie.dozentTeilnehmer;

class Dozent extends Person {
    Dozent(String name, String id) {
        super(name, id);
    }

    void leitenDenKurs(Kurs kurs) {
        kurs.setKursleiter(this);
    }

    public String toString() {
        return this.getName();
    }
}

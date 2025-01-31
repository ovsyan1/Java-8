package Vererbung.geometrie.dozentTeilnehmer;

class Teilnehmer extends Person {
    Teilnehmer(String name, String id) {
        super(name, id);
    }

    void kursTeilnehmen(Kurs kurs) {
        kurs.addTeilnehmer(this);
    }

    public String toString() {
        return this.getName();
    }
}

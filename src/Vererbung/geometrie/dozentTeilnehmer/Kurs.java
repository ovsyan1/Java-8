package Vererbung.geometrie.dozentTeilnehmer;

import java.util.Arrays;

class Kurs {
    private final int KURS_NUMMER;
    private Dozent kursleiter;
    private Teilnehmer teilnehmer;

    Kurs(int number) {
        this.KURS_NUMMER = number;
    }

    int getKURS_NUMMER() {
        return this.KURS_NUMMER;
    }

    void setKursleiter(Dozent d) {
        this.kursleiter = d;
    }

    Dozent getKursleiter() {
        return this.kursleiter;
    }

    void addTeilnehmer(Teilnehmer teilnehmer) {
        this.teilnehmer = teilnehmer;
    }

    Teilnehmer getTeilnehmer() {
        return this.teilnehmer;
    }

    public String toString() {
        return getClass().getSimpleName()
                + " number is: "
                + this.KURS_NUMMER
                + "\n"
                + "Kursleiter: "
                + this.getKursleiter()
                + "\n"
                + (this.getTeilnehmer() != null ? this.getTeilnehmer() : "es gibt kein Teilnehmer");
    }
}

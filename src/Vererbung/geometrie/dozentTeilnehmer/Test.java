package Vererbung.geometrie.dozentTeilnehmer;

class Test {
    public static void main(String[] args) {
        Kurs kurs = new Kurs(543);
        Dozent dozent = new Dozent("Stefan", "281q");
        Teilnehmer teilnehmer = new Teilnehmer("Vasilii", "i9543");

        dozent.leitenDenKurs(kurs);
        System.out.println(kurs);

        teilnehmer.kursTeilnehmen(kurs);
        System.out.println(kurs);
    }
}

package Klassen;

class Planet {
    String name;
    long entfernungZurSonne;
}

public class ZweiteAufgabePlanet {
    public static void main(String[] args) {
        Planet p1 = new Planet();
        Planet p2 = new Planet();

        p1.name = "Erde";
        p1.entfernungZurSonne = 147_000_000;

        p2.name = "Neptun";
        p2.entfernungZurSonne = 4500_000_000L;

        print(p1);
        print(p2);

        bewegen(p1, 10_000);
    }

    static void print(Planet planet) {
        System.out.println("Planet " + planet.name + " hat " + planet.entfernungZurSonne + " km zur Sonne");
    }

    static void bewegen(Planet planet, long neueEntfernung){
        System.out.println("alte Entfernung = " + planet.entfernungZurSonne);

        planet.entfernungZurSonne = neueEntfernung;

        System.out.println("neue Entfernung = " + planet.entfernungZurSonne);
    }
}

package Klassen;

class Land {
    String name;
    int einwohnerZahl;
}

public class ErsteAufgabeLand {
    public static void main(String[] args){
        Land b = new Land();
        Land d = new Land();

        b.name = "Brasilien";
        b.einwohnerZahl = 211_000_000;

        d.name = "Deutschland";
        d.einwohnerZahl = 83_000_000;

        print(b);
        print(d);
    }

    static void print(Land country) {
        System.out.println("Land " + country.name + " hat " + country.einwohnerZahl + " Einwohner");
    }
}

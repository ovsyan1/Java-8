package Vererbung.geometrie.polymorphieAbstract;

public class Test {
    public static void main(String[] args) {
        Hund hund = new Hund("Rex", 5, true);
        Katze katze = new Katze("Tom", 8, false);

        print(hund);
        print(katze);

        hund.laufen();
        katze.laufen();
    }

    static void print(Tier t) {
        System.out.println(t);
    }
}

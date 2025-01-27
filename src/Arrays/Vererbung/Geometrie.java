package Arrays.Vererbung;

public class Geometrie {
    public static void main(String[] args) {
        Rechteck rechteck = new Rechteck(3, 4);

        rechteck.bewegen(0, 0); // oder kann man ohne Aufruf implizit lassen, wird auch 0, 0
        System.out.println(rechteck.getCoordinates());

        rechteck.bewegen(12, -7);
        System.out.println(rechteck.getCoordinates());

        Kreis kreis = new Kreis(4);
        System.out.println(kreis.getCoordinates());


        kreis.bewegen(33, 1);
        System.out.println(kreis.getCoordinates());


        System.out.println(kreis);
    }
}

package Vererbung.geometrie.interfacesGetMaxAufgabe;

class Test implements Vergleicbar {
    public static void main(String[] args) {
        Size s1 = new Size(20);
        System.out.println(s1); // Size: 20

        Kreis k1 = new Kreis(3);
        System.out.println(k1); // Kreis. R = 3

        Size size1 = new Size(7);
        Size size2 = new Size(3);

        Kreis kreis1 = new Kreis(9);
        Kreis kreis2 = new Kreis(12);

        System.out.println(getMax(kreis1, size2)); // Size: 7
    }

    static Comparable getMax(Comparable c1, Comparable c2) {

        if( c1.compareTo(c2) > 0 ) {
            return c1;
        }

        return c2;
    }

    ;
}

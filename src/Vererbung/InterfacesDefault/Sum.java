package Vererbung.InterfacesDefault;

public interface Sum {
    /**
     * Addiert a.
     */
    void add(int a);

    /**
     * Addiert a, dann b.
     */
    default void add(int a, int b) {
//        add(a);
//        add(b);
        System.out.println("Does some default stuff(Sum)");
    };

    /**
     * Liefert die Summe zurück
     */
    int getSum();
}

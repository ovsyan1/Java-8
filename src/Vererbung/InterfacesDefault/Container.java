package Vererbung.InterfacesDefault;

public interface Container {
    /**
     * Speichert Element x im Container.
     */
    void add(int x);

    /**
     * Speichert im Container das Element x, danach das Element y.
     */
    default void add(int x, int y) {
//        add(x);
//        add(y);
        System.out.println("Does some default stuff(Container)");
    };

    /**
     * Liefert die Anzahl der Elemente im Container zurück
     */
    int getSize();
}

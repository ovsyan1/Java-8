package Vererbung.InterfacesDefault;

public interface Container {
    /**
     * Speichert Element x im Container.
     */
    void add(int x);

    /**
     * Speichert im Container das Element x, danach das Element y.
     */
    default void add(int x, int y) {};

    /**
     * Liefert die Anzahl der Elemente im Container zurück
     */
    int getSize();
}

package JavaAPI.ArrayListLambdas;

public class CPU {
    private int anzahlKerne;
    private String hersteller;

    CPU(int anzahlKerne, String hersteller) {
        this.anzahlKerne = anzahlKerne;
        this.hersteller = hersteller;
    }

    public String getHersteller() {
        return hersteller;
    }
}

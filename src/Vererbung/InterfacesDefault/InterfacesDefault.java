package Vererbung.InterfacesDefault;

public class InterfacesDefault {
    public static void main(String[] args) {
        Basic ref = new Basic();

        ref.add(2);

        System.out.println("getSum: " + ref.getSum());
        System.out.println("getSize: " + ref.getSize());

        ref.add(1,20);
        System.out.println("getSum: " + ref.getSum());
        System.out.println("getSize: " + ref.getSize());

    }
}

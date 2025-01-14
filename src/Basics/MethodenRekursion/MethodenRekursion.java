package Basics.MethodenRekursion;

public class MethodenRekursion {
    public static void main(String[] args) {
        int erg = getFakultaetRekursiv(3);
        System.out.println(erg);

        erg = getFakultaet(3);
        System.out.println(erg);



        erg = sumOfSums(3, 3);
        System.out.println(erg);
    }
    static int getFakultaetRekursiv(int value) {
        if(value == 1 || value == 0) {
            return 1;
        }

        return value * getFakultaetRekursiv(value - 1);
    }

    static int getFakultaet(int value) {
        int result = 1;

        for(int i = value;i > 1;i--) {
            result *= i;
        }
        return result;
    }

    static int sumOfSums(int a, int b) {
        if(a <= 0  || b <= 0) {
            return 0;
        }

        return (a + b)  + sumOfSums(--a, --b);

    }
}

package Basics.WhileDoWhile;

public class WhileDoWhile {
    static void b1() {
        int i = 0;

        while(i < 10) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();
    }

    static void b2() {
        int i = 0;

        while(i < 10) {
            if(i != 1) {
                System.out.print(i + " ");
            }
            i++;
        }

        System.out.println();
    }

    static void b3() {
        int i = -4;

        while(i <= 50){
            System.out.print(i + " ");
            i += 2;
        }

        System.out.println();
    }

    static void b4() {
        char i = 'a';

        while(i <= 'z'){
            System.out.print(i + " ");
            i++;
        }

        System.out.println();
    }

    static void b5() {
        char i = 'Z';

        while(i >= 'A'){
            System.out.print(i + " ");
            i--;
        }

        System.out.println();
    }

    static void b6() {
        int i = 1;

        while(i <= 100){
            if(i % 5 == 0){
                System.out.print(i + " ");
            }
            i++;
        }

        System.out.println();
    }

    static void b7() {
        int i = 3;

        while(i >= 1){
            System.out.print(i + " ");

            int j = 1;

            while(j<=i){
                System.out.print(j + " ");
                j++;
            }
            i--;
        }

        System.out.println();
    }

    static void b8() {
        int i = 0;

        do {
            System.out.print(i + " ");
            i++;
        } while(i < 10);

        System.out.println();
    }

    static void b9() {
        int i = 0;

        do {
            if(i != 1) {
                System.out.print(i + " ");
            }
            i++;
        } while(i < 10);

        System.out.println();
    }

    static void b10() {
        int i = -4;

        do {
            System.out.print(i + " ");
            i += 2;
        } while(i <= 50);

        System.out.println();
    }

    static void b11() {
        char i = 'a';

        do {
            System.out.print(i + " ");
            i++;
        }while(i <= 'z');

        System.out.println();
    }

    static void b12() {
        char i = 'Z';

        do {
            System.out.print(i + " ");
            i--;
        } while(i >= 'A');

        System.out.println();
    }

    static void b13() {
        int i = 1;

        do {
            if(i % 5 == 0){
                System.out.print(i + " ");
            }
            i++;
        } while(i <= 100);

        System.out.println();
    }

    static void b14() {
        int i = 3;

        do {
            System.out.print(i + " ");

            int j = 1;

            do {
                System.out.print(j + " ");
                j++;
            } while(j<=i);
            i--;
        } while(i >= 1);

        System.out.println();
    }


    public static void main(String[] args) {
        System.out.println("while");
        b1();
        b2();
        b3();
        b4();
        b5();
        b6();
        b7();

        System.out.println("do while");
        b8();
        b9();
        b10();
        b11();
        b12();
        b13();
        b14();
    }
}

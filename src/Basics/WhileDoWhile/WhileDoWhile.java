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


    public static void main(String[] args) {
        /* while */
        b1();
        b2();
        b3();
        b4();
        b5();
        b6();
        b7();

    }
}

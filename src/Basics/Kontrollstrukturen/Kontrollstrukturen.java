package Basics.Kontrollstrukturen;

public class Kontrollstrukturen {
    static void b1 () {
        int summe = 0;

        for(int i = 1;i <= 10;i++){
            summe += i;
        }

        System.out.println(summe);
    }

    static void b2() {
        int x = 3;
        int y = 4;
        int result = 1;

        for(int i = 0; i < y;i++) {
            result *= x;
        }
        System.out.println("Result " + result);
    }

    static void b3(){
        int x = 3;
        int y = 4;
        int result = 1;
        int counter = 0;

        while(counter < y){
            result *= x;
            counter++;
        }

        System.out.println("Result " + result);
    }

    static void b4() {
        int x = 3;
        int y = 4;

        System.out.println((int)Math.pow(x, y));
    }

    static void b5(){
        for(int i = 0;i < 4;i++){
            for(int j = 0;j < 4;j++){
                System.out.print('*');
            }
            System.out.println('*');
        }
    }

    static void b6(){
        for(int i = 0;i < 4;i++){
            if(i == 1 || i == 2) {
                System.out.print('*');
            }

            for(int j = 0;j < 4;j++){
                if(i == 1 || i == 2) {
                    if(j == 2) {
                        System.out.print("");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print('*');
                }
            }
            System.out.println('*');
        }
    }

    static void b7(){
        for(int j = 1; j <= 5;j++) {
            System.out.print(j);
        }
        System.out.println();
        for(char ch = 'A';ch <= 'E';ch++) {
            System.out.print(ch);
            for(int i = 0;i < 4;i++){
                System.out.print('.');
            }
            System.out.println();
        }
    }

    static String generateDay(int value) {
        switch(value){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return "31";
            case 2:
                return "28 oder 29";
            default:
                return "30";
        }

        /* Java 21
        return switch (value) {
            case 1, 3, 5, 7, 8, 10, 12 -> "31";
            case 2 -> "28 oder 29";
            default -> "30";
        };
         */
    }

    static int generateDaySecondVariant(int value) {
        switch(value){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            default:
                return 30;
        }
    }

    static void b8(){
        for(int month = 1; month <= 12; month++) {
            System.out.println("Monat " + month + '.' + " " + "Tage: " + generateDay(month));
        }
        System.out.println();
        for(int month = 1; month <= 12; month++) {
            System.out.println("Monat " + month + '.' + " " + "Tage: " + (month == 2 ? "28 oder 29" : generateDaySecondVariant(month)));
        }
    }

    public static void main(String[] args) {
        b1();
        System.out.println();
        b2();
        System.out.println();
        b3();
        System.out.println();
        b4();
        System.out.println();
        b5();
        System.out.println();
        b6();
        System.out.println();
        b7();
        System.out.println();
        b8();
    }
}

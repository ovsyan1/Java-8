package JavaAPI.StringEinfach;

public class StringIstImmerEinfach {
    public static void main(String[] args) {
        String s = "Do für die Note Do ist nicht dasselbe Do, wie das Do für Donnerstag";

        printIndexed(s);
    }

    static void printIndexed(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (i % 10 == 0) {
                System.out.print(i);
            } else {
                if (i > 10) {

                }
                System.out.print(" ");
            }

        }

        System.out.println();

        for (int i = 0; i < str.length(); i++) {
            if (i % 10 == 0) {
                System.out.print("|");
            } else {
                System.out.print(" ");
            }

        }

        System.out.println();

        int index = 0;
        for (int i = 0; i < str.length(); i++, index++) {
            if (index == 10) {
                index = 0;
            }
            System.out.print(index);
        }

        System.out.println();

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                System.out.print("|");
            } else {
                System.out.print(" ");
            }

        }

        System.out.println();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.print(ch);
        }

        System.out.println("\n*******");


        int indexDo = -1;

        while ((indexDo = str.indexOf("Do", indexDo + 1)) != -1) {
            System.out.println("Do index: " + indexDo);
        }

        System.out.println();
    }

}

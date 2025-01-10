package Basics.Methoden;

import java.util.Random;

public class Methoden {
    public static void main(String[] args) {
        printFromTo(33, 100);
        System.out.println();
        System.out.print(sum(20, 100));
        System.out.println();
        System.out.print(sumFromTo(100, 105));
        System.out.println();
        zeichneRechteck(5, 4);
        System.out.println();
        zeichneRechteck(5, 4, false);
        System.out.println();
        zeichneRechteck(5, 4, true);
        System.out.println();
        printRandom(5, 10, 20);
    }

    static void printFromTo(int from, int to) {
        for (int i = from; i <= to; i++) {
            System.out.print(i + " ");
        }
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sumFromTo(int from, int to) {
        int sum = from;
        for (int i = from; i <= to; i++) {
            sum += i;
        }

        return sum;
    }

    static void zeichneRechteck(int breite, int hoehe) {
        for (int i = 0; i < hoehe; i++) {
            for (int j = 0; j < breite; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    static void zeichneRechteck(int breite, int hoehe, boolean fuellen) {
        for (int i = 1; i <= hoehe; i++) {
            for (int j = 1; j <= breite; j++) {
                if (fuellen) {
                    System.out.print('*');
                } else {
                    if (j == 1 || i == 1 || i == hoehe || j == breite) {
                        System.out.print('*');
                    } else {
                        System.out.print(' ');
                    }
                }
            }
            System.out.println();
        }
    }

    static void printRandom(int count, int from, int to) {
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            int randomValue = random.nextInt(from, to);
            System.out.println(randomValue);
        }
    }
}

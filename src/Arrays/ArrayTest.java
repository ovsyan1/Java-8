package Arrays;

import java.util.concurrent.TimeUnit;

public class ArrayTest {
    static final int NUMBER_OF_TESTS = 5;

    static boolean equalsMitWhile(int[] a1, int[] a2) {
        if (a1.length != a2.length) {
            throw new IllegalArgumentException("Arrays are not equal");
        }
        int index = 0;
        boolean isEqual = true;

        while (index < a1.length) {
            if (a1[index] != a2[index]) {
                isEqual = false;
                break;
            }
            index++;
        }

        return isEqual;
    }

    static boolean equalsMitFor(int[] a1, int[] a2) {
        if (a1.length != a2.length) {
            throw new IllegalArgumentException("Arrays are not equal");
        }
        boolean isEqual = true;

        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
                isEqual = false;
                break;
            }
        }

        return isEqual;
    }

    public static void main(String[] args) {

        boolean bWhile = equalsMitWhile(new int[]{1, 2, 3}, new int[]{1, 2, 3});

        System.out.println(bWhile);

        boolean bFor = equalsMitFor(new int[]{3, 2, 3}, new int[]{3, 3, 3});

        System.out.println(bFor);

        System.out.println("\n******");

        long startWhile = System.currentTimeMillis();

        System.out.println("Start while: " + startWhile);
        for (int i = 0; i < NUMBER_OF_TESTS; i++) {
            equalsMitWhile(new int[]{1, 2, 3}, new int[]{1, 2, 3});
        }

        long finishWhile = System.currentTimeMillis();
        System.out.println("Finish while: " + finishWhile);



        long startFor = System.currentTimeMillis();

        System.out.println("Start for: " + startFor);
        for (int i = 0; i < NUMBER_OF_TESTS; i++) {
            equalsMitFor(new int[]{1, 2, 3}, new int[]{1, 2, 3});
        }

        long finishFor = System.currentTimeMillis();
        System.out.println("Finish while: " + finishFor);


    }
}

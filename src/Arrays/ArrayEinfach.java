package Arrays;

import java.util.Random;
import java.util.Arrays;

public class ArrayEinfach {
    public static void main(String[] args) {
        ArrayEinfach arrEinfach = new ArrayEinfach();

        int[] arr = createArray(15, 2, 33);

        arrEinfach.printArray(arr);

        System.out.println("deutscheUmlaute ----> " + Arrays.toString(deutscheUmlaute()));

        deutscheBuchstaben();

        System.out.println("Math Konstanten ----> " + Arrays.toString(getMathKonstanten()));

        int[] a1 = {1, 2, 3};
        int[] a2 = {12, 13, 14};

        int[] a3 = add(a1, a2);

        System.out.println(Arrays.toString(a3));

        int[] a4 = join(a1, a2);

        System.out.println(Arrays.toString(a4));
    }

    static int[] createArray(int val1, int val2, int len) {
        if (val1 == 0 || val2 == 0) {
            throw new IllegalArgumentException("With zero all array will be withs only zeros");
        }
        if (len <= 0) {
            throw new IllegalArgumentException("Length should be greater then 0");
        }

        Random random = new Random();

        int[] arr = new int[len];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = val1 < val2 ? random.nextInt(val1, val2 + 1) : random.nextInt(val2, val1 + 1);
        }

        return arr;
    }

    void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    static char[] deutscheUmlaute() {
        return new char[]{'ä', 'ö', 'ü'};
    }

    static void deutscheBuchstaben() {
        char[] arr = new char[30];

        for (char i = 'a'; i <= 'z'; i++) {
            //arr[i] = i;
        }
    }

    static double[] getMathKonstanten() {
        final double pi = Math.PI;
        final double e = Math.E;

        return new double[]{pi, e};
    }

    static void checkLength(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new IllegalArgumentException("length of arrays should be the same");
        }
    }

    static int[] add(int[] arr1, int[] arr2) {
        checkLength(arr1, arr2);

        int len = arr1.length;

        int[] result = new int[len];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (j != i) {
                    continue;
                }
                result[i] = arr1[i] + arr2[i];
            }
        }

        return result;
    }

    static int[] join(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;

        int[] result = new int[len1 + len2];

        for(int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }

        for(int j = 0; j < arr2.length; j++) {
            result[len1 + j] = arr2[j];
        }

        return result;
    }
}












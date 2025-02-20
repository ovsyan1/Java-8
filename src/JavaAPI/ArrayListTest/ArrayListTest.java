package JavaAPI.ArrayListTest;

import java.util.ArrayList;
//import java.util.Comparator;
import java.util.Collections;
import java.util.Random;
import java.util.Arrays;

public class ArrayListTest {
    public static void main(String[] args) {
        Random rnd = new Random();

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            arr.add(rnd.nextInt(-101, 101));
        }

        System.out.println(arr);

        ArrayList<String> arrStr = new ArrayList<>();
        arrStr.add("mo");
        arrStr.add("di");
        arrStr.add("mi");
        arrStr.add("do");
        arrStr.add("fr");

        for (String day : arrStr) {
            System.out.println("day: " + day);
        }

        ArrayList<String> arrStr1 = new ArrayList<>();
        arrStr1.add("10");
        arrStr1.add("20");
        arrStr1.add("30");
        arrStr1.add("40");
        arrStr1.add("50");
        arrStr1.add("60");
        arrStr1.add("70");
        arrStr1.add("80");

        for (int i = 0; i < arrStr1.size(); i++) {
            if (i % 2 == 0) {
                System.out.println("number: " + arrStr1.get(i));
            }
        }
        System.out.println();
        for (int i = arrStr1.size() - 1; i >= 0; i--) {
            System.out.println("number: " + arrStr1.get(i));

        }

        ArrayList<Integer> arr2 = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            arr2.add(rnd.nextInt(-101, 101));
        }

        arr2.sort((a, b) -> a - b);
        // ODER
        //arr2.sort(Comparator.naturalOrder());

        System.out.println("sortedArr: " + arr2);

        ArrayList<Integer> arr3 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arr3.add(rnd.nextInt(10, 15));
        }

        System.out.println("indexOf 12 ist: " + arr3.indexOf(12));

        ArrayList<Integer> arr4 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arr4.add(rnd.nextInt(51));
        }

        arr4.sort((a, b) -> a - b);
        System.out.println(Collections.binarySearch(arr4, 12));

        ArrayList<Integer> arr5 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arr5.add(rnd.nextInt(51));
        }
        System.out.println("arr5: " + arr5);

        for (int i = 0; i < arr5.size(); i++) {
            if (arr5.get(i) % 2 == 1) {
                arr5.remove(i);
            }
        }

        System.out.println("arr5: " + arr5);

        ArrayList<Integer> arr6 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arr6.add(rnd.nextInt(51));
        }

        System.out.println("arr6: " + arr6);

        arr6.removeIf((n) -> n % 2 == 1);

        System.out.println("arr6: " + arr6);

        ArrayList<Integer> arr7 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arr7.add(rnd.nextInt(51));
        }

        System.out.println("arr7: " + arr7);

        for (int i = 0; i < arr7.size(); i++) {
            if (arr7.get(i) % 2 == 1) {
                arr7.set(i, 0);
            }
        }

        System.out.println("arr7: " + arr7);

        ArrayList<String> arrStr8 = new ArrayList<>();
        arrStr8.add("mo");
        arrStr8.add("fr");
        arrStr8.add("di");
        arrStr8.add("fr");
        arrStr8.add("mi");
        arrStr8.add("fr");
        arrStr8.add("do");
        arrStr8.add("fr");

        System.out.println("arrStr8: " + arrStr8);

        for (int i = 0; i < arrStr8.size(); i++) {
            if (arrStr8.get(i).equals("fr")) {
                arrStr8.remove("fr");
            }
        }

        System.out.println("arrStr8: " + arrStr8);

        int[] a1 = { 1, 2, 3};
        int[] a2 = { -7, -5 };
        int[] a3 = { 101, 202, 303 };

        ArrayList<int[]> lastButNotLeastArr = new ArrayList<>();

        lastButNotLeastArr.add(a1);
        lastButNotLeastArr.add(a2);
        lastButNotLeastArr.add(a3);

        for(int[] item : lastButNotLeastArr) {
            System.out.println(Arrays.toString(item));
        }
    }
}

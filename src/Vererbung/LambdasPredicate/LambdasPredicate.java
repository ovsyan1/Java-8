package Vererbung.LambdasPredicate;

import java.util.function.Predicate;

public class LambdasPredicate {
    public static void main(String[] args) {
        LambdasPredicate ref = new LambdasPredicate();
        Integer[] arr = { -50, 1, 2, 0, 3, -22};

        Predicate<Integer> predicate1 = num -> num > 0;

        System.out.println("*************** - predicate 1");
        ref.printIf(arr, predicate1);

        Predicate<Integer> predicate2 = num -> num % 2 == 0;

        System.out.println("*************** - predicate 2");
        ref.printIf(arr, predicate2);

        Predicate<Integer> predicate3 = num -> num % 2 == 0 && num > 0;

        System.out.println("*************** - predicate 3");
        ref.printIf(arr, predicate3);
    }

    void printIf(Integer[] arr, Predicate<Integer> pr) {
        for (Integer val : arr) {
            if (pr.test(val)) {
                System.out.println(val);
            }
        }
    }
}

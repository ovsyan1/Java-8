package Vererbung.interfacesComparableComparatorPerson.Test;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("Paul", "Smith", 2000),
                new Person("Paul", "Black", 2003),
                new Person("John", "Smith", 1980),
                new Person("John", "Black", 2005),
                new Person("John", "Black", 1765)
        };
        System.out.println("Original: " + Arrays.toString(persons));

        System.out.println();
        Arrays.sort(persons);
        System.out.println("Sorted: " + Arrays.toString(persons));

        System.out.println();
        Person searchKey = new Person("John", "Black", 1765);
        int index = Arrays.binarySearch(persons, searchKey);
        System.out.println("Gesucht nach " + searchKey);
        System.out.println("index = " + index);

        System.out.println();
        Comparator<Person> cmpReverse = Comparator.reverseOrder();
        Arrays.sort(persons, cmpReverse);
        System.out.println("Reverse sorted: " + Arrays.toString(persons));

        System.out.println();
        Arrays.binarySearch(persons, searchKey, cmpReverse);
        System.out.println("Gesucht nach " + searchKey);
        System.out.println("index = " + index);

    }
}

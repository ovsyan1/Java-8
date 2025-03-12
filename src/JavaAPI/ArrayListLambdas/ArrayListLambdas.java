package JavaAPI.ArrayListLambdas;

import java.util.*;

public class ArrayListLambdas {
    public static void main(String[] args) {
        IntOperation op1 = new Sum();   // Kann Summe bilden
        System.out.println(op1.execute(2, 3)); // 5

        IntOperation op2 = (x, y) -> x + y;    // hier eine Lambda zum Bilden der Summe
        System.out.println(op2.execute(2, 3));  // 5

        IntOperation op3 = new Max(); // Kann den größeren Wert ermitteln
        System.out.println(op3.execute(-6, 17)); // 17

        IntOperation op4 = (x, y) -> Math.max(x, y); // hier eine Lambda um den größeren Wert zu ermitteln
        System.out.println(op4.execute(-6, 17)); // 17

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Hallo", "Moin", "Servus", "Hey", "Hallöchen"));
        Collections.sort(list, (a, b) -> a.length() - b.length());

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        // 2-3 Integer zur list1 hinzufügen...

        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        // 2-3 Integer zur list2 hinzufügen...

        ListCombiner combiner = (a, b) -> {
            a.addAll(b);
            return a;
        }; // hier die Lambda-Funktion
        List<Integer> list3 = combiner.combine(list1, list2);
        //list3 hat alle Elemente aus list1 und list2

        System.out.println(list3);

        ArrayList<CPU> listOfCpus = new ArrayList(Arrays.asList(
                new CPU(4, "Intel"),
                new CPU(8, "AMD"),
                new CPU(10, "TSMC"),
                new CPU(2, "ARM")
        ));

        listOfCpus.forEach(item -> System.out.println(item.getHersteller()));
    }
}

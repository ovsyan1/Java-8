package JavaAPI.ArrayListErweitert;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Random;
import java.util.Arrays;

public class ArrayListErweitert {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("mo");
        list.add("di");
        list.add("mi");
        list.add("do");
        list.add("fr");

        Iterator<String> it = list.iterator();

        System.out.println("A1. ******");
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("A2. ******");
        List<Integer> randomList1 = createRandomList(50, 0, 10);
        System.out.println(randomList1);
        randomList1.removeIf(item -> item % 2 != 0);
        System.out.println(randomList1);

        System.out.println("A3. ******");
        List<Integer> randomList2 = createRandomList(50, 0, 10);
        System.out.println(randomList2);
        randomList2.replaceAll(item -> item % 2 != 0 ? 0 : item);
        System.out.println(randomList2);

        System.out.println("A4. ******");
        List<Integer> randomList3 = createRandomList(50, 0, 10);
        System.out.println(randomList3);
        Object[] arrFromRandomList3 = randomList3.toArray();
        System.out.println(Arrays.toString(arrFromRandomList3));

        System.out.println("A5. ******");

        Integer[] arr = new Integer[]{ 1, 2, 3 };
        List<Integer> listFromOriginalArr = Arrays.asList(arr);
        List<Integer> listFromOriginalArr2 = Arrays.asList(new Integer[]{ 1,2,3 });
        List<Integer> listFromOriginalArr3 = Arrays.asList(1, 2, 3);
        System.out.println(listFromOriginalArr);
        System.out.println(listFromOriginalArr2);
        System.out.println(listFromOriginalArr3);

        System.out.println("A6. ******");
        List<String> daysList = new ArrayList<>();
        daysList.add("montag");
        daysList.add("di");
        daysList.add("mittw.");
        daysList.add("freitagabend");
        daysList.add("samstag");
        System.out.println(daysList);
        daysList.sort((a, b) -> a.length() - b.length());
        System.out.println(daysList);
    }

    static List<Integer> createRandomList(int start, int end, int length) {
        Random rnd = new Random();
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < length; i++) {
            list.add(rnd.nextInt(start - end) + 1);
        }

        return list;
    }
}

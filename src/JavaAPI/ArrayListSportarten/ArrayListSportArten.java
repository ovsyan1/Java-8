package JavaAPI.ArrayListSportarten;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListSportArten {
    public static void main(String[] args) {
        List<SportArt> sportArtenList = new ArrayList<>(Arrays.asList(
                new SportArt("Rugby15", false),
                new SportArt("Fußball", true),
                new SportArt("Rugby7", true),
                new SportArt("Ringen", true),
                new SportArt("Wushu", true)));

        System.out.println(sportArtenList);

        System.out.println(sportArtenList.contains(new SportArt("Ringen", true)));

        sportArtenList.removeIf(item -> !item.isOlympisch());
        System.out.println(sportArtenList);

        sportArtenList.sort((a, b) -> a.getName().length() - b.getName().length());
        System.out.println(Collections.binarySearch(sportArtenList, new SportArt("Rugby7", true), (a, b) -> a.getName().compareTo(b.getName())));
    }
}

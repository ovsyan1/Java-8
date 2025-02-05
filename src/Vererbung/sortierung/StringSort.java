package Vererbung.sortierung;

import java.util.Arrays;

class StringSort {
    public static void main(String[] args) {
        String[] strArr = { "Hannover", "Berlin", "Frankfurt", "Ahlem", "Essen", "Hamburg" };

        System.out.println(Arrays.toString(strArr));

        Arrays.sort(strArr);

        System.out.println(Arrays.toString(strArr));
    }
}

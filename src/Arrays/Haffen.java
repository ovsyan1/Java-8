package Arrays;

import java.util.Arrays;

public class Haffen {
    final int MAX_CAPACITY = 100;
    Schiff[] hafenCapacity = new Schiff[MAX_CAPACITY];

    Haffen(int schiffCount) {
        if(schiffCount >= MAX_CAPACITY){
            throw new IllegalArgumentException("max capacity in Haffen is 100 !!!");
        }

        for(int i = 0; i < schiffCount; i++) {
            this.hafenCapacity[i] = new Schiff();
        }
    }

    public String toString() {
        int emptySpace = 0;
        int occupiedPlace = 0;

        for(Schiff value : this.hafenCapacity) {
            if(value == null) {
                emptySpace++;
            } else {
                occupiedPlace++;
            }
        }
        return "Hafen (Schiffe: " + occupiedPlace + ". Freie Plätze: " + emptySpace + ")";
    }

    public static void main(String[] args) {
        Haffen h = new Haffen(12);

        System.out.println(h);

        System.out.println(new Schiff());
        System.out.println(new Schiff("Titanic"));
    }
}

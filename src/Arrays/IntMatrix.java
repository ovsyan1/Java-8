package Arrays;

import java.util.Random;

public class IntMatrix {
    private int[][] arr;

    IntMatrix(int zeile, int spalte) {
        arr = new int[zeile][spalte];
    }

    IntMatrix(int zeile, int spalte, int value) {
        this(zeile, spalte);

        for (int i = 0; i < this.arr.length; i++) {
            for (int j = 0; j < this.arr[i].length; j++) {
                this.arr[i][j] = value;
            }
        }
    }

    @Override
    public String toString() {
        String matrix = "";

        for (int i = 0; i < this.arr.length; i++) {
            for (int j = 0; j < this.arr[i].length; j++) {
                if (j == this.arr[i].length - 1) {
                    matrix += this.arr[i][j];
                    break;
                }
                matrix += this.arr[i][j] + ", ";
            }
            matrix += "\n";
        }

        return matrix;
    }

    int get(int val1, int val2) {
        return this.arr[val1][val2];
    }

    static IntMatrix getRandomMatrix(int len1, int len2, int value) {
        Random random = new Random();
        int randomValue = random.nextInt(value);

        return new IntMatrix(len1, len2, randomValue);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }

        IntMatrix m1 = this;
        IntMatrix m2 = (IntMatrix) obj;

        int[][] a1 = m1.arr;
        int[][] a2 = m2.arr;

        if (a1.length != a2.length || a1[1].length != a2[1].length) {
            return false;
        }

        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[i].length; j++) {
                if (a1[i][j] == a2[i][j]) {
                    return true;
                }
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        IntMatrix m1 = new IntMatrix(2, 3);

        System.out.println(m1);

        IntMatrix m2 = new IntMatrix(2, 3, 100);

        System.out.println(m2);

        int i1 = m1.get(1, 2);

        System.out.println(i1);

        System.out.println();

        int i2 = m2.get(1, 2);

        System.out.println(i2);

        IntMatrix m3 = IntMatrix.getRandomMatrix(4, 6, 200);

        System.out.println();

        System.out.println(m3);

        boolean isEqual = m1.equals(m2);

        System.out.println(isEqual);
    }
}

package Arrays;

public class Arrays2D {
    public static void main(String[] args) {
        int[][] arr = createArray(4, 5);

        printArrray(arr);

        System.out.println();

        arr[1][1] = 5;

        printArrray(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 2;
            }
        }

        System.out.println();

        printArrray(arr);

        System.out.println();

        int[][] arr2 = createArray(4, 5, 8);

        printArrray(arr2);
    }

    static int[][] createArray(int len1, int len2) {
        return new int[len1][len2];
    }

    static void printArrray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == arr[i].length - 1) {
                    System.out.print(arr[i][j]);
                    break;
                }
                System.out.print(arr[i][j] + ", ");
            }
            System.out.println();
        }
    }

    static int[][] createArray(int len1, int len2, int value) {
        int[][] arr = new int[len1][len2];

        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                arr[i][j] = value;
            }
        }
        return arr;
    }
}

class TestArray2D {
    public static void main(String[] args) {
        char[][] charArr = createBorderedArray(5, 'X');

        printArray(charArr);
    }

    static char[][] createBorderedArray(int len, char value) {
        char[][] arr = new char[len][len];

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if(i == 0 || i == len - 1 || j == 0 || j == len -1){
                    arr[i][j] = value;
                } else {
                    arr[i][j] = ' ';
                }

            }
        }

        return arr;
    }

    static void printArray(char[][] arr) {
        for (char[] chars : arr) {
            for (char aChar : chars) {
                System.out.print(aChar);
            }
            System.out.println();
        }
    }

}

package Arrays;

public class Arrays2D {
    public static void main(String[] args) {
        int[][] arr = createArray(4, 5);

        printArrray(arr);
    }

    static int[][] createArray(int len1, int len2) {
        return new int[len1][len2];
    }

    static void printArrray(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length;j++) {
                System.out.print("0 ");
            }
            System.out.println();
        }
    }
}

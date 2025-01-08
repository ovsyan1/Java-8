package Basics.ForSchleife;

public class ForSchleife {
    public static void main(String[] args) {
        for(int i = 0;i < 10;i++) {
            System.out.print(i);
            System.out.print(" ");
        }

        System.out.println();

        for(int i = 0;i < 10;i++) {
            if(i == 1) {
                continue;
            }
            System.out.print(i);
            System.out.print(" ");
        }

        System.out.println();

        for(int i = -4;i <= 50;i += 2){
            System.out.print(i);
            System.out.print(" ");
        }

        System.out.println();

        for(char i = 'a';i <= 'z';i++){
            System.out.print(i);
            System.out.print(" ");
        }

        System.out.println();

        for(char i = 'Z';i >= 'A';i--){
            System.out.print(i);
            System.out.print(" ");
        }

        System.out.println();

        for(int i = 1;i <= 100;i++){
            if(i % 5 == 0){
                System.out.print(i);
                System.out.print(" ");
            }

        }
    }

}

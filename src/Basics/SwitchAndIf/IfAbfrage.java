package Basics.SwitchAndIf;

import java.util.Scanner;

public class IfAbfrage {
    public static void main(String[] args) {
        //String farbe = "Rot";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide color of Traffic light");

        String farbe = scanner.nextLine();

        switch(farbe){
            case "Rot":
                System.out.println("Bitte warten");
                break;
            case "Gelb":
                System.out.println("Gleich geht es los");
                break;
            case "Grün":
                System.out.println("Weg frei");
                break;
            default:
                System.out.println("Fehler! Diese Farbe gibt es nicht.");
        }

        if(farbe.equals("Rot")){
            System.out.println("Bitte warten");
        } else if(farbe.equals("Gelb")) {
            System.out.println("Gleich geht es los");
        } else if(farbe.equals("Grün")) {
            System.out.println("Weg frei");
        } else {
            System.out.println("Fehler! Diese Farbe gibt es nicht.");
        }
    }
}

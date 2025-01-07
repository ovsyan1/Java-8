import java.util.Scanner;

public class IfAbfrage {
    public static void main(String[] args) {
        //String ampelFarbe = "Rot";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide color of Traffic light");

        String ampelFarbe = scanner.nextLine();

        switch(ampelFarbe){
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

        if(ampelFarbe.equals("Rot")){
            System.out.println("Bitte warten");
        } else if(ampelFarbe.equals("Gelb")) {
            System.out.println("Gleich geht es los");
        } else if(ampelFarbe.equals("Grün")) {
            System.out.println("Weg frei");
        } else {
            System.out.println("Fehler! Diese Farbe gibt es nicht.");
        }
    }
}

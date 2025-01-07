public class IfAbfrage {
   /* "Rot. Bitte warten"
            "Gelb. Gleich geht es los"
            "Grün. Weg frei"
            "Fehler! Diese Farbe gibt es nicht."

    */

    public static void main(String[] args) {
        String ampelFarbe = "Rot";

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
    }
}

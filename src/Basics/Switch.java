package Basics;

public class Switch {
    public static void main(String[] args) {
        char ch = 'ß';

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Das ist ein Vokal.");
                break;
            case 'ä':
            case 'Ä':
            case 'Ö':
            case 'ö':
            case 'Ü':
            case 'ü':
            case 'ß':
                System.out.println("Das ist Deutsche Buchstabe.");
                break;
            default:
                System.out.println("Das ist ein Konsonant.");
        }
    }
}

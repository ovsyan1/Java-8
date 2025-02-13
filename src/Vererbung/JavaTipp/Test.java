package Vererbung.JavaTipp;

import java.util.function.Predicate;
import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        JavaTipp[] javaTipps = {
                new JavaTipp(
                        "Mit dem Schlüsselwort 'implements' kann eine Klasse ein Interface realisieren.",
                        new String[]{
                                "Vererbung",
                                "Klassen",
                                "Interfaces"
                        }),
                new JavaTipp(
                        "Eine Klasse kann nur eine andere Klasse erweitern. ",
                        new String[]{
                                "Vererbung",
                                "Klassen",
                        }),
                new JavaTipp(
                        "Statische Methoden werden mit dem Klassennamen aufgerufen.",
                        new String[]{
                                "Klassen",
                                "Methoden",
                                "static",
                        }),
                new JavaTipp(
                        "Alle Attribute in einem neuen Objekt werden im Konstruktor initialisiert.",
                        new String[]{
                                "Klassen",
                                "Konstruktoren",
                                "Attribute"
                        }),
                new JavaTipp(
                        "Beim Überschreiben darf die Sichtbarkeit nicht verschärft werden.",
                        new String[]{
                                "Klassen",
                                "Methoden",
                                "Überschreiben"
                        }),
                new JavaTipp(
                        "Alle Elemente in einem Interface sind immer 'public'",
                        new String[]{
                                "Interfaces",
                                "Sichtbarkeiten",
                                "Java 8"
                        }),
        };

        customSearch(javaTipps, (x) -> true);
        System.out.println();
        customSearch(javaTipps, (x) -> x.getText().contains("Klasse"));
        System.out.println();
        customSearch(javaTipps, (x) -> x.getThemen().length == 2);
        System.out.println();
        customSearch(javaTipps, (x) -> {
            for(String tipp : x.getThemen()) {
                if(tipp == "Klassen") {
                    return true;
                }
            }
            return false;
        });
        System.out.println();
        customSearch(javaTipps, (x) -> {
            for(String tipp : x.getThemen()) {
                System.out.println("------> " + tipp);
                if(tipp.equals("Klassen")) {
                    return true;
                }
            }
            return false;
        });
    }

    static void customSearch(JavaTipp[] tipps, Predicate<JavaTipp> p) {
        for (JavaTipp tipp : tipps) {
            if (p.test(tipp)) {
                System.out.println(tipp);
            }
        }
    }
}

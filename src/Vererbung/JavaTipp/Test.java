package Vererbung.JavaTipp;

import java.util.function.Predicate;

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
            for (String tipp : x.getThemen()) {
                if (tipp.equals("Klassen")) {
                    return true;
                }
            }
            return false;
        });
        System.out.println();

        customSearch(javaTipps, (x) -> {
            boolean isClass = false;
            boolean isInheritance = false;
            for (String tip : x.getThemen()) {
                if (tip.equals("Klassen")) {
                    isClass = true;
                }
                if (tip.equals("Vererbung")) {
                    isInheritance = true;
                }
            }
            return isClass && isInheritance;
        });
        System.out.println();

        customSearch(javaTipps, (x) -> {
            boolean isClass = false;
            boolean isInterface = false;
            for (String tipp : x.getThemen()) {
                if (tipp.equals("Klassen")) {
                    isClass = true;
                }
                if (tipp.equals("Interfaces")) {
                    isInterface = true;
                }
            }
            return isClass && isInterface;
        });
        System.out.println();

        customSearch(javaTipps, (x) -> {
            if (x.getText().contains("Klasse erweitern")) {
                for (String tipp : x.getThemen()) {
                    if (tipp.equals("Klassen")) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        });
    }

    static void customSearch(JavaTipp[] tips, Predicate<JavaTipp> p) {
        for (JavaTipp tip : tips) {
            if (p.test(tip)) {
                System.out.println(tip);
            }
        }
    }
}

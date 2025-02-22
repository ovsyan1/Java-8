package Klassen;

public class TestPerson {

    public static void main(String[] args) {
        Person person1 = new Person("OlafF", "Scholz", 1958, 10557);

        System.out.println(person1.toString());

        System.out.println("*********");

        person1.setFirstName("Olaf");

        System.out.println("First name was updated \n" + person1.toString());

        System.out.println("*********");

        Person person2 = new Person("Angela", "Merkel", 1954);

        System.out.println(person2.toString());

        System.out.println("*********");

        System.out.println(Person.getMustermann());
    }

}

class Person {
    private String vorname = "-";
    private String nachname = "-";
    private int geburtsjahr;
    private int postleitzahl;

    Person() {}

    Person(String vorname) {
        this.vorname = vorname;
    }

    Person(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    Person(String vorname, String nachname, int geburtsjahr) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsjahr = geburtsjahr;
    }

    Person(String vorname, String nachname, int geburtsjahr, int postleitzahl) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsjahr = geburtsjahr;
        this.postleitzahl = postleitzahl;
    }

    String getFirstName() {
        return this.vorname;
    }

    void setFirstName(String firstName) {
        this.vorname = firstName;
    }

    String getLastName() {
        return this.nachname;
    }

    void setLastName(String lastName) {
        this.nachname = lastName;
    }

    int getYearOfBirth() {
        return this.geburtsjahr;
    }

    void setYearOfBirth(int year) {
        this.geburtsjahr = year;
    }

    int getPostalCode() {
        return this.postleitzahl;
    }

    void setPostalCode(int postalCode) {
        this.postleitzahl = postalCode;
    }

    public String toString() {
        // String firstName ="Vorname: " + (this.vorname.trim().isEmpty() ? "-" : this.vorname);
        // String lastName = "Nachname: " + (this.nachname.trim().isEmpty() ? "-" : this.nachname);
        String firstName ="Vorname: " + this.vorname;
        String lastName = "Nachname: " + this.nachname;
        String yearOfBirth = "Geburtsjahr: " + (this.geburtsjahr > 0 ? this.geburtsjahr : "-");
        String postalCode = "Plz: " + (this.postleitzahl > 0 ? this.postleitzahl : "-");

        return  firstName + "\n" + lastName + "\n" + yearOfBirth + "\n" + postalCode;
    }

    static Person getMustermann() {
        return new Person("Max", "Mustermann", 1960, 12345);
    }
}


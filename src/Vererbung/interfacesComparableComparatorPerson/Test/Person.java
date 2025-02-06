package Vererbung.interfacesComparableComparatorPerson.Test;

class Person implements Comparable<Person> {
    private String vorname, nachname;
    private int geburtsjahr;


    Person(String vorname, String nachname, int geburtsjahr) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsjahr = geburtsjahr;
    }

    String getVorname() {
        return this.vorname;
    }

    String getNachname() {
        return this.nachname;
    }

    int getGeburtsjahr() {
        return this.geburtsjahr;
    }

    @Override
    public int compareTo(Person p) {
        int result = this.getVorname().compareTo(p.getVorname());

        if (result == 0) {
            result = this.getNachname().compareTo(p.getNachname());
            if (result == 0) {
                result = this.getGeburtsjahr() - p.getGeburtsjahr();
            }
        }

        return result;
    }

    @Override
    public String toString() {
        return this.vorname + " " + this.nachname + " " + this.geburtsjahr;
    }
}

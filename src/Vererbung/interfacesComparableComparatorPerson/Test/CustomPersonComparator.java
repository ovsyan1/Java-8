package Vererbung.interfacesComparableComparatorPerson.Test;

import java.util.Comparator;

class CustomPersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        int result = p1.getNachname().compareTo(p2.getNachname());

        if (result == 0) {
            result = p1.getVorname().compareTo(p2.getVorname());
            if(result == 0) {
                result = p1.getGeburtsjahr() - p2.getGeburtsjahr();
            }
        }

        return result;
    }
}
// [Paul Smith 2000, Paul Black 2003, John Smith 1980, John Black 2005, John Black 1765] - original
// [John Black 2005, John Black 1765, Paul Black 2003, John Smith 1980, Paul Smith 2000] - without check of birthday date
// [John Black 1765, John Black 2005, Paul Black 2003, John Smith 1980, Paul Smith 2000] - with


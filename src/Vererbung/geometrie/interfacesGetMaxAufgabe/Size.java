package Vererbung.geometrie.interfacesGetMaxAufgabe;

class Size implements Comparable<Size> {
    private int value;

    Size(int value) {
        this.value = value;
    }

    int getSize() {
        return this.value;
    }

    public int compareTo(Size s2) {
        Size s1 = this;
        if (s1.value < s2.value) {
            return -1;
        } else if (s1.value > s2.value) {
            return 1;
        } else {
            return 0;
        }
    }

    ;

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + this.value;
    }
}

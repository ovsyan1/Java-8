public class Main {
    public static void main(String[] args) {
    }
}

class Tahiti {
    Tahiti t;

    public static void main(String[] args) {
        Tahiti t = new Tahiti();
        Tahiti t2 = t.go(t);
        t2 = null; // t2 eligible for GC
        // Zeile A
        // ...
    }

    Tahiti go(Tahiti t) {
        Tahiti t1 = new Tahiti();
        Tahiti t2 = new Tahiti(); // can't be deleted, because has reference on t
        t1.t = t2;
        t2.t = t1;
        t.t = t2;
        return t1;
    }

    // Ergebnis: GC kann nur ein Objekt löschen 
}

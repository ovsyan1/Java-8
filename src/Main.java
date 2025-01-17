//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    }
}

class Tahiti {
    Tahiti t;

    public static void main(String[] args) {
        Tahiti t = new Tahiti();
        Tahiti t2 = t.go(t);
        t2 = null; // eligible for GC
        // Zeile A
        // ...
    }

    Tahiti go(Tahiti t) { // t.t has reference on 1 Object
        Tahiti t1 = new Tahiti(); // t1.t has reference on 1 Object
        Tahiti t2 = new Tahiti(); // t2.t has reference on 1 Object eligible for GC
        t1.t = t2;
        t2.t = t1;
        t.t = t2;
        return t1;
    }
}
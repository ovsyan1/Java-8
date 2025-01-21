package Arrays;

public class Schiff {
    String name;

    Schiff() {}

    Schiff(String name) {
        this.name = name;
    }

    public String toString() {
        if(this.name == null) {
            return "Hi from Schiff";
        }
        return "My name is: " + this.name;
    }
}

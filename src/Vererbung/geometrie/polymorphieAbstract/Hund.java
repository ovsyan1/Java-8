package Vererbung.geometrie.polymorphieAbstract;

class Hund extends Tier {
    Hund(String name, int alter, boolean gesund) {
        super(name, alter, gesund);
    }

    @Override
    void laufen() {
        System.out.println("Hund " + this.getName() +  (this.isGesund() ? " läuft" : " ist krank"));
    }

    @Override
    public String toString() {
        return "Hund. Name: " + this.getName();
    }
}

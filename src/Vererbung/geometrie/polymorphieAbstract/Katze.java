package Vererbung.geometrie.polymorphieAbstract;

class Katze extends Tier {
    Katze(String name, int alter, boolean gesund) {
        super(name, alter, gesund);
    }

    @Override
    void laufen() {
        System.out.println("Katze " + this.getName() + (this.isGesund() ? " läuft" : " ist krank"));
    }

    @Override
    public String toString() {
        return "Katze. Name: " + this.getName();
    }
}

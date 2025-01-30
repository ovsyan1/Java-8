package Vererbung.geometrie.polymorphieAbstract;

abstract class Tier {
    private String name;
    private int alter;
    private boolean gesund;

    Tier(String name, int alter, boolean gesung) {
        this.name = name;
        this.alter = alter;
        this.gesund = gesung;
    }

    public String getName() {
        return name;
    }

    public int getAlter() {
        return alter;
    }

    public boolean isGesund() {
        return gesund;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public void setGesund(boolean gesund) {
        this.gesund = gesund;
    }

    abstract void laufen();
}

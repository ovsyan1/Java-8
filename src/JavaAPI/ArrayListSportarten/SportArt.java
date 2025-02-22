package JavaAPI.ArrayListSportarten;

class SportArt {
    private String name;
    private boolean olympisch;

    SportArt(String name, boolean olympisch) {
        this.name = name;
        this.olympisch = olympisch;
    }

    String getName() {
        return this.name;
    }

    boolean isOlympisch() {
        return this.olympisch;
    }

    @Override
    public String toString() {
        return this.name + " " + this.olympisch;
    }

    @Override
    public boolean equals(Object obj) {
        return ((SportArt) obj).getName().equals(this.name);
    }
}

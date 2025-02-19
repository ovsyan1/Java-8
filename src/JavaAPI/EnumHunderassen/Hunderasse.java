package JavaAPI.EnumHunderassen;

public enum Hunderasse {
    DACKEL(0.5) {
        public String toString() {
            return name() + getTxt() + getMaxGroesse();
        }
    },
    COLLIE(1){
        public String toString() {
            return name() + getTxt() + getMaxGroesse();
        }
    },
    DOGGE(1.5){
        public String toString() {
            return name() + getTxt()  + getMaxGroesse();
        }
    };

    private double maxGroesse;
    private String txt = ", max. Größe: ";

    Hunderasse(double maxGroesse) {
        this.maxGroesse = maxGroesse;
    }

    public double getMaxGroesse() {
        return this.maxGroesse;
    }

    public String getTxt() {
        return this.txt;
    }

}

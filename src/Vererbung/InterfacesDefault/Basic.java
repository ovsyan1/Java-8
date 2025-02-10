package Vererbung.InterfacesDefault;

class Basic implements Sum, Container {
    //private int sum;
    //private int size;
    private int value;

    @Override
    public void add(int val) {
        this.value = this.value + val;
    }

    @Override
    public void add(int val1, int val2) {
        //return 1;
    }

    @Override
    public int getSum() {
        return this.value;
    }

    @Override
    public int getSize() {
        return this.value;
    }
}

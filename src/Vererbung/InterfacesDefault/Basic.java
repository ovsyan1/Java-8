package Vererbung.InterfacesDefault;

class Basic implements Sum, Container {
    private int sum;
//    private int size;
    private int[] container = new int[3];

    @Override
    public void add(int val) {
        this.sum = this.sum + val;
//        this.size++;
        this.saveInArr(val);
    }

    private void saveInArr(int val) {
        for(int i = 0; i < container.length;i++) {
            container[i] = val;
        }
    }

    @Override
    public void add(int a, int b) {
        this.add(a);
        this.add(b);
    }

    @Override
    public int getSum() {
        return this.sum;
    }

    @Override
//    public int getSize() {
//        return this.size;
//    }
    public int getSize() {
        return this.container.length;
    }
}

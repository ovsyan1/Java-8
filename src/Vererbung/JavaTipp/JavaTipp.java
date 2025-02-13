package Vererbung.JavaTipp;

class JavaTipp {
    private String text;
    private String[] themen;

    JavaTipp(String text, String[] themen) {
        this.text = text;
        if (themen.length <= 3) {
            this.themen = themen;
        }

    }

    String getText() {
        return this.text;
    }

    String[] getThemen() {
        return this.themen;
    }


    @Override
    public String toString() {
        return getText();
    }
}

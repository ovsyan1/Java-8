package Vererbung.geometrie.textFormat;

class TextHandler {
    String text;

    TextHandler(String text) {
        this.text = text;
    }

    String plain() {
        return this.text;
    }

    void setText(String newText) {
        this.text = newText;
    }
}

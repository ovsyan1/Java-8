package Vererbung.geometrie.textFormat;

class MarkdownTextFormat extends TextHandler {
    MarkdownTextFormat(String text) {
        super(text);
    }

    String bold() {
        return "__" + this.text + "__";
    }
}

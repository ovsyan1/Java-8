package Vererbung.geometrie.textFormat;

class HtmlTextFormat extends TextHandler {
    HtmlTextFormat(String text) {
        super(text);
    }

    String bold() {
        return "<b>" + this.text + "</b>";
    }
}

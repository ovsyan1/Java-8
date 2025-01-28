package Vererbung.geometrie.textFormat;

public class TextFormat {
    public static void main(String[] args) {
        String text = "Heute ist Dienstag";

        HtmlTextFormat htmlFormat = new HtmlTextFormat(text);
        System.out.println(htmlFormat.bold()); // <b>Heute ist Dienstag</b>
        System.out.println(htmlFormat.plain()); // Heute ist Dienstag

        MarkdownTextFormat mdFormat = new MarkdownTextFormat(text);
        System.out.println(mdFormat.bold());  // __Heute ist Dienstag__
        System.out.println(mdFormat.plain());  // Heute ist Dienstag

        mdFormat.setText("Freitag");

        System.out.println(mdFormat.bold());  // __Freitag__
        System.out.println(mdFormat.plain());  // Freitag
    }
}

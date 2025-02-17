package JavaAPI.StringEinfach;

public class StringEinfach {
    public static void main(String[] args) {
        String str = "Java ist toll";

        System.out.println(reverseString(str));

        String fileStr = "Person.txt";
        System.out.println(isTextFile(fileStr));

        String fileStr1 = "Person.pdf";
        System.out.println(isTextFile(fileStr1));

        String fileStr3 = "Person.tXT";
        System.out.println(isTextFile(fileStr3));
    }

    static boolean isTextFile(String str) {
        int indexDot = str.indexOf(".");

        String fileFormat = str.substring(indexDot + 1);

        return fileFormat.toLowerCase().equals("txt");
    }

    static String reverseString(String str) {
        String result = "";

        for(int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }

        return result;
    }
}

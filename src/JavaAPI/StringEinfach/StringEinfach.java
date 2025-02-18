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

        String fileStr4 = "hallo.welt.txt";
        System.out.println(isTextFile(fileStr4));

        String fileStr5 = ".txt";
        System.out.println(isTextFile(fileStr5));
    }

    static boolean isTextFile(String str) {
        if(str.indexOf(".") == 0) {
            return false;
        }
        int indexDot = str.lastIndexOf(".");

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

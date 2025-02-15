package JavaAPI.printf.StringTest;

public class StringTest {
    public static void main(String[] args) {
        String s = new String();
        String s1 = "";

        System.out.println("s: " + s);
        System.out.println("s1: " + s1);

        System.out.println("s.length(): " + s.length());
        System.out.println("s1.length(): " + s1.length());

        System.out.println();

        String s2 = new String("Hallo");
        String s3 = "Hallo";

        System.out.println("s2: " + s2);
        System.out.println("s3: " + s3);

        System.out.println("s2.length(): " + s2.length());
        System.out.println("s3.length(): " + s3.length());

        System.out.println();

        String s4 = s2.concat(s3);
        System.out.println("s4: " + s4);

        System.out.println();

        String s5 = s4 + s4;

        System.out.println("s5: " + s5);

        String s6 = "Welt";
        System.out.println(s6.charAt(0));
        System.out.println(s6.isEmpty());
        System.out.println(s6.endsWith("t"));
        System.out.println(s6.toUpperCase().startsWith("L", 2));

        String s7 = "York";
        String s8 = "York";

        System.out.println(s7 == s8); // String Pool ?

        String s9 = new String("York");
        String s10 = new String("York");

        System.out.println(s9 == s10);

        System.out.println();

        String s11 = "York";
        String s12 = "York";

        System.out.println(s11.equals(s12)); // String Pool ?

        String s13 = new String("York");
        String s14 = new String("YorK");

        System.out.println(s13.equalsIgnoreCase(s14));

        String s15 = "MacBook";
        System.out.println(s15.lastIndexOf("o"));
        System.out.println(s15.replace('M', 'm'));
        System.out.println(s15.substring(0, 3));
    }
}

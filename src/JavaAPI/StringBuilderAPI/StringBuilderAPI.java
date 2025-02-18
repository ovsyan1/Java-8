package JavaAPI.StringBuilderAPI;

public class StringBuilderAPI {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(0);
        sb.append("adfa");
        //sb.delete(1,3);
        sb.deleteCharAt(2);
        sb.insert(2, "---");
        sb.replace(0, 2, "Kyiv").reverse();

        System.out.println(sb.charAt(0));
        System.out.println(sb.toString());


        StringBuilder sb1 = new StringBuilder("Comcave");

        System.out.println(sb1.substring(3, 5));

        System.out.println(sb1);
        sb1.setCharAt(0, 'q');
        sb1.setLength(22);
        System.out.println(sb1);
    }
}

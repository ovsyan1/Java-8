package JavaAPI.DateTimeCalendar;

import java.time.Month;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.YearMonth;
import java.util.Scanner;

public class DateTimeCalendar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter month");
        int month = Month.valueOf(scanner.nextLine().toUpperCase().trim()).getValue();

        System.out.println("Please enter year");
        int year = Year.of(Integer.parseInt(scanner.nextLine())).getValue();

        printCalendar(month, year);
    }

    static void printCalendar(int month, int year) {
        for (int i = 0; i < 19; i++) {
            System.out.print('-');
        }
        System.out.println();
        YearMonth defaultDate = YearMonth.of(year, month);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM y");
        String formattedDefaultDate = defaultDate.format(dtf);
        System.out.println(formattedDefaultDate);

        for (int i = 0; i < 19; i++) {
            System.out.print('-');
        }
        System.out.println();

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern(" dd |  EEEE");
        String textFormater = "%-18s|%n";

        for (int i = 1; i <= defaultDate.lengthOfMonth(); i++) {
            System.out.format(textFormater, defaultDate.atDay(i).format(dtf1));
        }

        for (int i = 0; i < 19; i++) {
            System.out.print('-');
        }
    }
}

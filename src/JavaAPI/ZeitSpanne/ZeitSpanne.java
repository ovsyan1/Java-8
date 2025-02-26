package JavaAPI.ZeitSpanne;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class ZeitSpanne {
    public static void main(String[] args) {
        ZoneId zone1 = ZoneId.of("UTC+1");
        ZoneId zone2 = ZoneId.of("UTC+2");

        ZonedDateTime dateTime1 = ZonedDateTime.of(2025, 2,2, 12,0,0,0, zone1);

        ZonedDateTime dateTime2 = ZonedDateTime.of(2025, 2,2, 16,0,0,0, zone2);

        System.out.println(dateTime1);
        System.out.println(dateTime2);

        /*
        * 12 hours (UTC+1) -> 12 - 1 == 11
        * 16 hours (UTC+2) -> 16 - 2 == 14
        * */

        System.out.println("Reisezeit: " + ChronoUnit.HOURS.between(dateTime1, dateTime2) + " Strunden");

        //A2

        ZonedDateTime dateTime3 = ZonedDateTime.of(2025, 2,2, 8,0,0,0, zone2);

        dateTime3 = dateTime3.plusHours(3);
        System.out.println(dateTime3.withZoneSameInstant(zone1));


        //A3
        String zoneName = "Europe/Berlin";
        ZoneId zoneBerlin = ZoneId.of(zoneName);
        ZonedDateTime dateTime4 = ZonedDateTime.of(2018, 3,25, 1,0,0,0, zoneBerlin);
        ZonedDateTime dateTime5 = ZonedDateTime.of(2018, 3,25, 4,0,0,0, zoneBerlin);

        Duration d = Duration.between(dateTime4, dateTime5);

        System.out.println("Time between: " + d.toHours());
    }
}

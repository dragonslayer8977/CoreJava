package DataTimeAPI;

import java.time.*;

// old date time API was mutable and not thread safe
// the months would start from 0 not 1
// time-zone handling was poorly designed

public class DateTimeAPI {

    public static void main(String[] args) {

        LocalDateTime dateTime = LocalDateTime.now ();
        System.out.println (dateTime);

        LocalTime time = LocalTime.now ();
        System.out.println (time);

        LocalDate date = LocalDate.now ();
        System.out.println (date);

        ZonedDateTime datetime1 = ZonedDateTime.now (ZoneId.of("America/Sao_Paulo"));
        System.out.println (datetime1);


    }
}

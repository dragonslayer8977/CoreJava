package DataTimeAPI;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {

    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern ("d MMM uu"); // 5 Feb 26

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern ("MMM-dd-uuuu"); // Feb-05-2026

        System.out.println (
                LocalDate.now ().format (formatter1)
        );

    }
}

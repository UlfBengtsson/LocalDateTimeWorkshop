package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ExDateTimeFormatter {

    public static void main(String[] args) {

        LocalDateTime nextXmas = LocalDateTime.of(2020,12,24,15,0);

        System.out.println(nextXmas);

        String isoXmas = nextXmas.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);

        System.out.println(isoXmas);

        String pattern = "dd-MMMM y H:mm";
        String custom = nextXmas.format(DateTimeFormatter.ofPattern(pattern));
        System.out.println(custom);

        LocalDate todaysDate = LocalDate.now();
        LocalTime timeToday = LocalTime.now();

        LocalDateTime combind = LocalDateTime.of(todaysDate,timeToday);
        LocalDateTime quickerWay = LocalDateTime.now();
    }
}

package org.example;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class ExLocalTime {


    public static void main(String[] args) {

        LocalTime timeNow = LocalTime.now();

        System.out.println(timeNow);

        LocalTime lectureStart = LocalTime.of(9, 10);

        System.out.println(lectureStart);

        LocalTime textTime = LocalTime.parse("11:45:12");

        System.out.println(textTime);
    }

}

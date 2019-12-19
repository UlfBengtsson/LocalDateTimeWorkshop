package org.example;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ExLocalDate {

    public static void main(String[] args) {

        LocalDate dateNow = LocalDate.now();
        System.out.println(dateNow);

        LocalDate myBirthDate = LocalDate.of(1982,8,25);
        System.out.println(myBirthDate);

        Period howOld = Period.between(myBirthDate,dateNow);

        System.out.println(howOld.getYears());

        LocalDate tomorrow = dateNow.plus(1, ChronoUnit.DAYS);

        System.out.println(tomorrow);

        LocalDate OneDecadeFromNow = dateNow.plus(1, ChronoUnit.DECADES);

        System.out.println(OneDecadeFromNow);
    }
}

package basics;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class TimeTest2 {

    public static void main(String[] args) {

        LocalDate ld = LocalDate.now();
        LocalTime lt = LocalTime.now();

        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);
        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.MIN);

        System.out.println(ld);
        // LocalDate, LocalTime und LocalDateTime sind IMMUTABLE
        System.out.println(ld.plusYears(10));
        System.out.println(ld.plusMonths(2));
        System.out.println(ld.plusWeeks(7));
        System.out.println(ld.minusDays(8));
        ld = ld.plusDays(5); // Variable zeigt auf das neue Objekt

        // ChronoUnit muss von LocalDate unterstützt sein
        System.out.println(ld.plus(100, ChronoUnit.DAYS));

        LocalDateTime ldt = ld.atTime(LocalTime.now()); // Datum wird mit einer Zeit verknüpft

        // ChronoField muss von LocalDate unterstützt sein
        System.out.println(ld.getLong(ChronoField.DAY_OF_YEAR));

        System.out.println(ld.isAfter(LocalDate.now()));
        System.out.println(ld.isBefore(LocalDate.now()));
    }
}

package basics;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class PeriodTest {

    public static void main(String[] args) {

        LocalDate jetzt = LocalDate.now();
        LocalDate em = LocalDate.of(2024, 6, 14);

        //Period und Duration sind IMMUTABLE

        // Zeitdauer
        System.out.println(Period.of(2, 2, 15));
        Period p = Period.between(jetzt, em);

        System.out.println(p);
        System.out.println(p.getYears()); // Fragt die Jahre ab
        System.out.println(p.get(ChronoUnit.DAYS)); // Fragt die Tage ab
        System.out.println(p.minusDays(2)); // Zeitdauer wird um 2 Tage verlängert
        System.out.println(p.withMonths(10)); // Überschreibt die Anzahl Monate

        // Bei LocalDate verwendet man eine Period
        // Bei LocalTime verwendet man eine Duration
        System.out.println(LocalDate.now().plus(p));

        // Bestimmte Einheit von jetzt bis em
        System.out.println(ChronoUnit.DAYS.between(jetzt, em));

        System.out.println();

        p = Period.of(2, 32, 0);
        System.out.println(p);
        System.out.println(p.normalized());

        System.out.println();

        p = Period.of(2, 0, 100);
        System.out.println(p);
        System.out.println(p.normalized()); // Tage werden nicht in Monate umgerechnet

        Year y = Year.of(2022);
        //YearMonth ym = y.atMonth(10);
        YearMonth ym = y.atMonth(Month.APRIL);
        LocalDate date = ym.atDay(5);
        System.out.println(date);

    }
}

package basics;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Scanner;

public class TimeTest {

    private static final Scanner scanner = new Scanner(System.in);
    public static final DateTimeFormatter FMT_DATE = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    public static final DateTimeFormatter FMT_TIME = DateTimeFormatter.ofPattern("HH:mm");

    public static final DateTimeFormatter FMT_DATE_TIME = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);

    public static void main(String[] args) {

        LocalDate ld = LocalDate.now(); // Datum
        ld = LocalDate.of(2000, 2, 28);
        ld = LocalDate.of(2000, Month.FEBRUARY, 22);
        System.out.println(ld);

        LocalTime lt = LocalTime.now(); // Zeit
        lt = LocalTime.of(15, 17, 22);
        System.out.println(lt);

        LocalDateTime ldt = LocalDateTime.now(); // Beides
        ldt = LocalDateTime.of(ld, lt); // Beides
        System.out.println(ldt);
        System.out.println(ldt.toLocalDate());
        System.out.println(ldt.toLocalTime());



        while(true) {
            try {
                System.out.print("Eingabe (Datum): ");
                String input = scanner.nextLine();
                ld = LocalDate.parse(input, FMT_DATE);
                break;

            } catch (DateTimeException e) {
                System.out.println("Falsches Format!");
            }
        }
        System.out.println(ld.format(FMT_DATE));

        while(true) {
            try {
                System.out.print("Eingabe (Zeit): ");
                String input = scanner.nextLine();
                lt = LocalTime.parse(input, FMT_TIME);
                break;

            } catch (DateTimeException e) {
                System.out.println("Falsches Format!");
            }
        }
        System.out.println(lt.format(FMT_TIME));

        System.out.println(LocalDateTime.of(ld, lt).format(FMT_DATE_TIME));


        // Veraltet
        // Date now = new Date();
        // Date now = new Date(2000, 10, 15, 16, 22);
        // Date now = new Date(System.currentTimeMillis());
        // System.out.println(now);

    }

}

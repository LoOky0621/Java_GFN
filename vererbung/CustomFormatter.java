package vererbung;

import java.time.format.DateTimeFormatter;

interface CustomFormatter {

    // automatisch public static final
    DateTimeFormatter FMT_DATE = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    DateTimeFormatter FMT_TIME = DateTimeFormatter.ofPattern("HH:mm");

    // seit Java 1.7 können Interfaces auch statische Methoden enthalten

}

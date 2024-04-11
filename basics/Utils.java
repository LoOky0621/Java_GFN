package basics;

import java.time.format.DateTimeFormatter;

public class Utils {

    public static final DateTimeFormatter FMT_DATE = DateTimeFormatter.ofPattern("EEEE dd.MM.yyyy");
    public static final DateTimeFormatter FMT_TIME = DateTimeFormatter.ofPattern("HH:mm");

    private Utils() {
    }
}

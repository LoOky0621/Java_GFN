package basics;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UtilTest {

    public static void main(String[] args) {

        LocalDate ld = LocalDate.now();
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ld.format(Utils.FMT_DATE));
        System.out.println(ldt.format(Utils.FMT_TIME));
    }
}

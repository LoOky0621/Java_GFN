package basics;

import java.time.LocalDate;
import java.util.ArrayList;

public class StringTest {

    public static void main(String[] args) {

        String s1 = "Das ist das Haus von Nikigraus!"; // Literal landet im Pool
        String s2 = "Das ist das Haus von Nikigraus!"; // Verweis auf das Objekt im Pool

        System.out.println(s1 == s2); // Referenzvergleich
        System.out.println(s1.equals(s2)); // Wertvergleich
        System.out.println(s1.hashCode() + " " + s2.hashCode());


        System.out.println();

        s1 = "Das ist das Haus von Nikigraus!";
        s2 = new String("Das ist das Haus von Nikigraus!"); // Objekt landet nicht im Pool

        System.out.println(s1 == s2); // Referenzvergleich
        System.out.println(s1.equals(s2)); // Wertvergleich
        System.out.println(s1.hashCode() + " " + s2.hashCode());

        // wenn zwei Objekt per equals gleich sind, MÜSSEN sie den gleich HashCode liefern

        System.out.println();

        LocalDate ld1 = LocalDate.of(2000, 10, 15);
        LocalDate ld2 = LocalDate.of(2000, 10, 15);
        System.out.println(ld1 == ld2); // Referenzvergleich
        System.out.println(ld1.equals(ld2)); // Wertvergleich
        System.out.println(ld1.hashCode() + " " + ld2.hashCode());

        String s = "";

        // ""
        // "."
        // ".."
        //s = "..."

        for (int i = 0; i < 1000; i++) {
            s += ".";
            // s = s + ".";
        }

        System.out.println(s);

        System.out.println();

        s = "Moin";
        s = s.toLowerCase(); // jede Veränderung eines Strings produziert ein neues Objekt
        System.out.println(s);

        var x = 10; // Compiler ermittelt automatisch den Datentyp, int
        var y = "Hallo"; // String

        Object o = "Hallo Welt"; // String ist von Objekt abgeleitet
        o = 123; // Integer ist von Objekt abgeleitet
        o = new ArrayList(); // ArrayLi ist von Objekt abgeleitet

    }
}

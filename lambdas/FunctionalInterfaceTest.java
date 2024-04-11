package lambdas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FunctionalInterfaceTest {

    public static void main(String[] args) {


        // Deklaration des Lambda
        // void doJob(LocalDate date, String description)
        Job j1 = (ld, desc) -> System.out.println(ld.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) + ": " + desc.toUpperCase());

        // Verwendung des Lambda
        j1.doJob(LocalDate.now(), "Dies und das!");

        // boolean run(String a, String b, boolean caseSensitive);
        CompareString cs = (a, b, c) -> {
            if(!c) {
                a = a.toLowerCase();
                b = b.toLowerCase();
            }

            return a.equals(b);
        };

        System.out.println(cs.run("Hallo Welt", "hallo welt", true));
        System.out.println(cs.run("Hallo Welt", "hallo welt", false));

        cs = (x, y, z) -> z;

        // int generate();
        RandGenerator rg1 = () -> 10;
        RandGenerator rg2 = () -> (int)(Math.random() * 10) + 1;

        System.out.println(rg2.generate());
        System.out.println(rg2.generate());
        System.out.println(rg2.generate());
        System.out.println(rg2.generate());
        System.out.println(rg2.generate());
        System.out.println(rg1.generate());
        System.out.println(rg1.generate());

        //CheckValue c1 = (v) -> v <= 10;
        CheckValue c1 = v -> v <= 10;
        //CheckValue c1 = (int v) -> v <= 10; // datentypangabe ist optional
        System.out.println(c1.check(100));
    }
}

@FunctionalInterface
interface Job {

    void doJob(LocalDate date, String description);

    // Alle Methoden von Object sind bereits implementiert und werden daher beim SAM nicht
    // als abstrakte Methoden gewertet
    String toString();

}

@FunctionalInterface
interface CompareString {

    boolean run(String a, String b, boolean caseSensitive);

}

@FunctionalInterface
interface RandGenerator {

    int generate();

}

@FunctionalInterface
interface CheckValue {

    boolean check(int value);

}
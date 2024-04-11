package basics;

import java.util.*;

public class SpliteratorTest {

    public static void main(String[] args) {

        List<String> namen = new ArrayList<>(List.of("Peter", "Carol", "Bruce", "Steve", "Tony", "Natasha", "Scott"));

        namen = new ArrayList<>();
        namen.addAll(List.of("Peter", "Carol", "Bruce", "Steve", "Tony", "Natasha", "Scott")); // diese hinzufügen

        System.out.println(namen);

        namen.removeAll(List.of("Steve", "Scott")); // diese raus, den Rest aufbewahren
        System.out.println(namen);

        namen.retainAll(List.of("Tony", "Carol")); // Diese aufbewahren, den rest raus
        System.out.println(namen);

        ListIterator<String> lItr = namen.listIterator(); // Erlaubt eine vor- und rückwärts (next(), previous()) Bewegung
        System.out.println(lItr.next());
        System.out.println(lItr.next());
        // System.out.println(lItr.next()); // Exception: keine weiteren Elemente
        System.out.println(lItr.previous());

        Iterator<String> itr = namen.iterator(); // Erlaubt eine vorwärts Bewegung
        System.out.println(itr.next());
        System.out.println(itr.next());

        System.out.println();

        namen = new ArrayList<>(List.of("Peter", "Carol", "Bruce", "Steve", "Tony", "Natasha", "Scott"));

        //namen.add(10, "Hans"); // Exception
        namen.add(5, "Hans");
        namen.add(8, "Hans-Peter"); // der nächste freie Index

        System.out.println(namen);

        //Spliterator<String> names = namen.spliterator();
        //names.forEachRemaining(n -> System.out.println(n));
    }
}

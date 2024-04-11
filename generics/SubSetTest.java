package generics;

import java.util.*;

public class SubSetTest {

    public static void main(String[] args) {

        // Seit Java 1.9
        // Dieses Set eine feste Größe
        Set<String> set1 = Set.of("Peter", "Bruce", "Carol", "Natasha", "Steve");
        // List.of();
        // Map.of();
        // Queue.of();

        // Dieses List eine feste Größe
        List<String> list1 = Arrays.asList("Peter", "Bruce", "Carol", "Natasha", "Steve");

        TreeSet<String> namen = new TreeSet<>(Set.of("Peter", "Bruce", "Carol", "Natasha", "Steve"));
        //namen.addAll(Set.of("Peter", "Bruce", "Carol", "Natasha", "Steve"));

        System.out.println(namen);
        Set<String> part = namen.subSet("A", "H");
        part.add("Gozilla"); // Akzeptiert nur Werte zwischen A und H
        // Werte werden beim Hinzufügen auch in das Originalset (namen) hinzugefügt

        System.out.println(part);
        System.out.println(namen);


    }
}

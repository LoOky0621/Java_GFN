package generics;

import java.time.LocalDateTime;
import java.util.*;

public class CollectionTest {

    public static void main(String[] args) {

        // Liste
        //List<String> namen1 = new ArrayList<>();
        List<String> namen1 = new LinkedList<>();
        namen1.add("Carol");
        namen1.add("Peter");
        namen1.add("Peter");
        System.out.println(namen1);
        System.out.println(namen1.get(1));

        System.out.println();

        // Menge
        Set<String> namen2 = new HashSet<>(); // Hash basierte Datenstruktur
        namen2.add("Carol");
        namen2.add("Peter");
        namen2.add("Peter");

        System.out.println(namen2);

        System.out.println();

        // Warteschlange
        Queue<String> namen3 = new LinkedList<>();

        // Queue hat keine get-Methode
        //List<String> namen4 = (List<String>) namen3;
        //namen4.get(10);

        namen3.add("Carol");
        namen3.add("Peter");
        namen3.add("Peter");
        System.out.println(namen3);
        System.out.println(namen3.poll());
        System.out.println(namen3);
        System.out.println(namen3.poll());
        System.out.println(namen3);
        System.out.println(namen3.poll());
        System.out.println(namen3);
        System.out.println(namen3.poll());
        System.out.println(namen3);

        // Maps
        Map<LocalDateTime, String> termine = new HashMap<>();
        termine.put(LocalDateTime.now(), "Essen mit Carol");
        termine.put(LocalDateTime.of(2023, 11, 29, 15, 22), "Essen mit Peter");


        LinkedList<String> linkedList = new LinkedList<>();
        // linkedList = new ArrayList<>(); // Error: Downcasting
        Queue<String> q = linkedList; // Upcasting


    }


}

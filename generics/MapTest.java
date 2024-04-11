package generics;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {

    public static void main(String[] args) {

        // Map<LocalDate, String> termine = new HashMap<>(); // Schnell
        Map<LocalDate, String> termine = new TreeMap<>(); // Immer sortiert

        termine.put(LocalDate.of(2000, 1, 15), "Der Winter ist da!");
        termine.put(LocalDate.of(2010, 7, 10), "Essen mit Bob");
        termine.put(LocalDate.of(2007, 10, 1), "Der Herbst ist da.");
        termine.put(LocalDate.of(2023, 11, 30), "Das Jahr ist bald beendet.");

        System.out.println(termine);

        // Values
        for (String s : termine.values()) {
            System.out.println(s);
        }

        System.out.println();

        // Keys
        for (LocalDate k : termine.keySet()) {
            System.out.println(k);
        }

        System.out.println();

        // Entry (Key und Value)
        for (Map.Entry<LocalDate, String> e : termine.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }
    }
}

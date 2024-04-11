package basics;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListTest1 {

    public static void main(String[] args) {

        // Collections nehmen nur komplexe Datentypen auf
        ArrayList list1 = new ArrayList(); // RAW-Type
        list1.add("Moin");
        list1.add(123); // Autoboxing von int zu Integer
        list1.add(true); // Autoboxing von boolean zu Boolean
        list1.add(LocalDate.now());

        for (Object o : list1) {
            System.out.println(o); // die Identität der eigentlichen Objekte ist hier nicht bekannt
        }

        System.out.println();

        //ArrayList<String> list2 = new ArrayList<String>(); // vor Java 1.7
        ArrayList<String> list2 = new ArrayList<>(); // Nimmt nur Strings entgegen
        list2.add("Peter");
        list2.add("Bruce");
        list2.add("Natasha");
        list2.add("Carol");
        //list2.add(123); // Error: Kein String

        for(String s : list2) {
            System.out.println(s.toUpperCase());
        }

        // Referenztyp            // Objekttyp
        List<String> list3 = new ArrayList<>();
        // für Referenztypen werden, wenn verfügbar Interfaces beutzt

        list3.add("Peter"); // 0
        list3.add("Carol"); // 1
        list3.add("Bruce"); // 2
        //list3.add(1, "Natasha"); // Verschiebungen im Array

        list3 = new LinkedList<>(list3); // Wechsel von ArrayList auf LinkedList
        list3.add(1, "Natasha"); // Verlinkungen werden angepasst
        //...
        list3 = new ArrayList<>(list3); // Wechsel von LinkedList auf ArrayList

        System.out.println(list3.get(3));

        // add("Wert") -> einfügen an die nächste freie Stelle
        // add(1, "Wert") -> einfügen an eine bestimmte Stelle
        // get(5) -> Wert an Position abfragen

        // addAll(Collection) -> mehrere Werte auf einen Schlag übernehmen

        //list3.remove("Wert") // Wert wird entfernt
        //list3.remove(1) // Wert an Position wird entfernt

        // list3.set(3, "Neuer Wert"); // Ersetzt Element an gewüschter Position

        // Iteration

        // Funktioniert nur für Listen
        for (int i = 0; i < list3.size() ; i++) {
            System.out.println(list3.get(i));
        }

        System.out.println();

        for (String s : list3) {
            System.out.println(s);
        }

        System.out.println();

        // mit einem Lambda
        list3.forEach(w -> System.out.println(w));

        System.out.println();

        // Iterationsobjekt
        Iterator<String> itr = list3.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}

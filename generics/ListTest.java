package generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {

        List<String> namen = new ArrayList<>();
        namen.add("Peter"); // 0
        namen.add("Bruce"); // 1
        namen.add("Carol"); // 2
        namen.add(1, "Natasha"); // 2

        // Möglicher Index ist 0 bis size der Collection
        // namen.add(5, "Tony"); // Exception: 4 noch möglich
        // namen.get(100); // Exception
        // namen.set(5, "Steve"); // Exception: Ersetzen, geht nur an bereits vorhandenen Positionen

        // List: Geordnet aber nicht sortiert

        Collections.sort(namen);
        namen.add("Tony"); // Ist wieder nicht sortiert


        // Arbeiten mit Lambdas
        // Lambdas ist eine Kurzschreibweise für Anonyme-Klassen

        // Verlangt einen Consumer
        namen.forEach((wert) -> System.out.println(wert));

        // Verlangt ein Predicate
        namen.removeIf((x) -> x.equals("Peter"));
        System.out.println(namen);

        // Verlangt einen UnaryOperator
        namen.replaceAll((v) -> v.toUpperCase());
        System.out.println(namen);


        // Anonyme Klasse = Einwegklasse

        User u1 = new User() { // Eine veränderte Klasse ohne Namen wird deklariert und sofort instanziert

            // Hier kann die Klasse verändert werden
            @Override
            public String getName() {
                return super.getName().toUpperCase();
            }
        };

        u1.setName("peter");
        System.out.println(u1.getName());

        User u2 = new User();
        u2.setName("bruce");
        System.out.println(u2.getName());

        Food f1 = () -> System.out.println("Crunch crunch");
        Food f2 = () -> System.out.println("Schlurf...");
        Food f3 = () -> System.out.println("Grrrr!");
        f1.getSound();
        f2.getSound();
        f3.getSound();


        List<String> namen5 = new ArrayList<>();
        namen5.add("Peter");
        namen5.add("Bruce");
        namen5 = new LinkedList<>(namen5); // Wechsel von ArrayList auf LinkedList
        namen5 = new ArrayList<>(namen5); // Wechsel von LinkedList zurück auf ArrayList

    }
}

class User {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// FunctionalInterfaces sind Interfaces mit nur einer einzigen abstrakten Methode
@FunctionalInterface
interface Food {

    void getSound();

}




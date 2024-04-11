package generics;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueTest {

    public static void main(String[] args) {

        Queue<String> jobs = new LinkedList<>();
        jobs.offer("Einkaufen"); // alternativ kann auch add benutzt werden
        jobs.offer("Wäsche waschen");
        jobs.offer("Staub saugen");

        System.out.println(jobs);

        while(!jobs.isEmpty()) {
            // poll entfernt das Element aus der Queue
            System.out.println(jobs.poll()); // Alternativ remove

            // peek zeigt das Element am Anfang der Warteschlange ohne es zu entfernen
            //System.out.println(jobs.peek()); // Alternativ element
        }

        System.out.println(jobs);

        jobs.offer("Mit dem Hund spazieren gehen");

        // Veraltet
        Stack<String> stack = new Stack<>();
        stack.push("Einkaufen"); // Element auf den Stack legen
        stack.push("Wäsche waschen");
        stack.push("Staub saugen");
        System.out.println(stack.pop()); // Das oberste Element vom Stack entfernen

        System.out.println();

        // Collections ist eine Utility-Klasse für Datenstrukturen
        Queue<String> lifo = Collections.asLifoQueue(new LinkedList<>());
        lifo.offer("Einkaufen");
        lifo.offer("Wäsche waschen");
        lifo.offer("Staub saugen");
        System.out.println(lifo.poll());



    }

}

package streams;

import java.util.List;

public class IterationTest1 {

    public static void main(String[] args) {

        List<Integer> zahlen = List.of(10,20,30,40,50,60,70,80,90,100);

        // Externe Iteration
        for (int i = 0; i < zahlen.size() ; i++) {
            System.out.println(zahlen.get(i));
        }

        for (int i : zahlen) {
            System.out.println(i);
        }

        // Interne Iteration
        zahlen.forEach(i -> System.out.print(i + ", "));
        System.out.println("\n");

        // void run();
        fuehreMethodeAus(() -> System.out.println("1...2...3"));

        System.out.println();

        fuehreMethodeAus(() -> {
            System.out.println("1...");
            System.out.println("2...");
            System.out.println("3...");
            System.out.println("4...");
            System.out.println("etc.");
        });

    }

    static void fuehreMethodeAus(Runnable r) {
        System.out.println("START");
        r.run();
        System.out.println("ENDE");
    }
}


interface Runnable {

    void run();

}

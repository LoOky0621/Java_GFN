package lambdas;

import java.util.function.Consumer;

public class LmbdaBindingTest {

    static int zahl = 100;
    static String wort = "Hi";


    public static void main(String[] args) {

        // Consumer: void accept(T t);
        Consumer<String> cons1 =  v -> {
            int zahl = 200; // Lokale Variable überlagert die Klassen/Instanz-Variable
            System.out.println(v.toUpperCase() + zahl);
        };

        Consumer<Integer> cons2 =  v -> System.out.println(v.doubleValue() + wort);

        cons1.accept("Das ist ein Haus von Nikigraus!");
        cons2.accept(123);

        int x = 200;
        // Lokale Variable kann  benutzt werden, sie muss final oder effektiv final sein
        Consumer<Integer> cons3 =  v -> System.out.println(v.doubleValue() * x);

        final int y = 200;
        Consumer<Integer> cons4 =  v -> System.out.println(v.doubleValue() * y);
        // y = 300; // Error: Finale Variablen dürfen nicht geändert werden!!!!

        createLambda().accept(100);
    }

    static Consumer<Integer> createLambda() {

        int z = 250;
        // z muss final oder effektiv final sein
        // Error: z ist nicht effektif final - wird nachträglich geändert

        Consumer<Integer> cons =  v -> System.out.println(v.doubleValue() * z);
        //z = 300;

        return cons;
        // Am Ende der Methode wird z vom Stack entfernt
    }
}

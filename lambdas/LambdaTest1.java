package lambdas;

import java.util.function.Consumer;

public class LambdaTest1 {

    public static void main(String[] args) {

        /* JavaScript Beispiel
        let func1 = function(a, b) {
            // Anweisungen
        }

        func1(10,15);

        let func2 = function(c) {
            // Anweisungen
        }

        func2(func1);
        */


        // Bei nur einem Parameter kann auch die Klammer weggelassen werden
        Consumer<Integer> cons = v -> System.out.println(v);

        cons = (v) -> {
            System.out.println("--- START ---");
            System.out.println(v);
            System.out.println("--- ENDE ---");
        };

        Object o = "String";
        o = 123;
        //o = v -> System.out.println(v); // Nicht erlaubt!
        o = cons;

        // Lambdas überschreiben die einzige abstrakte Methode des FunctionalInterface
        MathOperation m1 = (a, b) -> a * b;
        System.out.println(m1.exec(10,15));

        // double exec(double a, double b);
        MathOperation m2 = (a, b) -> a + b;
        System.out.println(m2.exec(10,15));

        MathOperation m3 = (x, y) -> x - y;
        System.out.println(m3.exec(10,15));

        MathOperation m4 = (x, y) -> x * y * Math.PI;
        System.out.println(m4.exec(2,7));

        System.out.println();

        // Lamdas können als Parameter weitergegeben werden
        run(7,15, m4);

        System.out.println();
        // Lambda direkt übergeben
        run(7,15, (a, b) -> a * a * a * b * b); // Ausdruck im Lambda produziert automatisch ein return

        run(7,15, (a, b) -> {
            double sum = a + a + a;
            return sum + b;
        });
    }

    public static void run(double a, double b, MathOperation op) {
        System.out.println(op.exec(a,b));
    }
}

@FunctionalInterface // Annotation prüft, ob Voraussetzungen für ein SAM erfüllt sind
interface MathOperation {

    double exec(double a, double b);

    // double doSomething(double a, double b); // Im FunctionalInterface darf es nur eine abstrakte Methode geben

}

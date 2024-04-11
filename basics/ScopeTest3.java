package basics;

import java.util.OptionalInt;

public class ScopeTest3 {

    private int i = 10;

    public static void main(String[] args) {
        new ScopeTest3().start();
    }

    private void start() {

        System.out.println(i);
        {
            i = 25; // Instanzvariable wird geändert
            int i = 20; // Deklaration der lokalen Variable überlagert die Instanzvariable
            i = 30; // Lokale Variable wird geändert
            this.i = 35; // Änderung der Instanzvariable
            System.out.println(i);
        }
        i = 40; // Instanzvariable wird geändert
        System.out.println(i);

        System.out.println();

        System.out.println(doSomethingElse(-15));

        try {
            System.out.println(doSomethingElse1(-15));
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        // Optionals sind sehr flexibel!!!!!
        doSomethingElse2(-15).ifPresent(System.out::println);

    }

    private void doSomething() {
        System.out.println("Hi");
        return; // Verlassen der Methode
        // System.out.println("Ende");
    }

    private int doSomethingElse(int zahl) {
        System.out.println("Hi");
        if(zahl > 0) {
            return 10;
        }
        return -1; // Verlassen der Methode
    }

    private int doSomethingElse1(int zahl) {
        // Es muss entweder eine Rückgabe vom passenden Typ erfolgen
        // oder eine Exception muss geworfen werden

        if(zahl > 0) {
            return 10;
        }

        //return -1;
        throw new RuntimeException("Wert zu klein!");
    }

    private OptionalInt doSomethingElse2(int zahl) {

        // Optional ist ein Objekt welchen gefüllt oder leer sein kann

        if(zahl > 0) {
            return OptionalInt.of(10);
        }

        return OptionalInt.empty();
    }
}

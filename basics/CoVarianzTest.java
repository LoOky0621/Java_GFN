package basics;

import java.io.IOException;

public class CoVarianzTest {

    public static void main(String[] args) {

        AA a1 = new AA();
        // AA a2 = new BB(); // BB IS-A AA? BB ist abstract, keine Instanzierung möglich
        AA a3 = new CC(); // CC IS-A AA?
        Object o1 = new CC(); // CC IS-A Object?
        // Überall wo ein Objekt von AA verlangt wird kann auch eine direkte oder indirekte Kindklasse verwendet werden

        a3.doSomething();
        //a3.doSomething(10); // Über die Referenz von AA sehen wir die überladene Methode nicht!
        ((CC)a3).doSomething(10);

        AA.Xyz.machWas();

        StringBuilder sb = null;
        //sb.equals(null); // StringBuilder überschreibt equals nicht! Verwendet die Version aus Object!

        byte b = 100;
        char c = 65;
        System.out.println(c);


    }
}

class AA {

    int x = y;
    static int y = 10;

    static final double PI;
    static {
        // Hier müssen statische Konstanten spätestens ihren Wert bekommen
        PI = 3.14;
    }

    final double NUM; // Instanzkonstanten müssen spätestens im Konstruktor zugewiesen sein!

    {
        // Werden vor dem Konstruktor aufgerufen
        NUM = 100;
    }

    void doSomething() {
        System.out.println("AA do");
        Xyz.machWas();
    }

    interface Xyz {

        public static void machWas() {
            System.out.println("Xyz.machWas()");
        }
    }
}

abstract class BB extends AA {

    public BB() {
    }

    @Override
    void doSomething() throws RuntimeException {
        System.out.println("BB do");
    }

}

class CC extends BB {

    @Override
    void doSomething() {
        System.out.println("CC do");
    }

    // Überladen
    void doSomething(int i) {
        System.out.println("CC do " + i);
    }
}
